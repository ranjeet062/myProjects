package com.example.kafkablobbuffer.service;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import com.example.kafkablobbuffer.config.AppProperties;
import com.example.kafkablobbuffer.model.BufferedRecord;
import com.example.kafkablobbuffer.model.BlobPayloadChunk;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class PartitionBufferManager {

    private static final Logger log = LoggerFactory.getLogger(PartitionBufferManager.class);

    private final AppProperties appProperties;
    private final ChunkFlushService chunkFlushService;

    private final Map<TopicPartition, Map<String, PartitionBuffer>> buffers = new HashMap<>();

    public PartitionBufferManager(AppProperties appProperties, ChunkFlushService chunkFlushService) {
        this.appProperties = appProperties;
        this.chunkFlushService = chunkFlushService;
    }

    private String extractTenantId(ConsumerRecord<String, byte[]> record) {
        // Extract tenantId from record headers or key (implement based on your use case)
        return record.headers().lastHeader("tenantId") != null
                ? new String(record.headers().lastHeader("tenantId").value(), StandardCharsets.UTF_8)
                : "defaultTenant";
    }
    public synchronized void appendAndFlushIfNeeded(
            org.apache.kafka.clients.consumer.ConsumerRecord<String, byte[]> record,
            Acknowledgment acknowledgment,
            Consumer<String, byte[]> consumer
    ) {


        TopicPartition topicPartition = new TopicPartition(record.topic(), record.partition());
        String tenantId = extractTenantId(record); // Extract tenantId from the record (implement this method as needed)
        Map<String, PartitionBuffer> tenantBuffers = buffers.computeIfAbsent(topicPartition, tp -> new HashMap<>());
        PartitionBuffer buffer = tenantBuffers.computeIfAbsent(tenantId, id -> newBuffer(topicPartition));
        buffer.append(BufferedRecord.from(record, appProperties.buffer().payloadTypeHeader()));
        if (buffer.shouldFlush()) {
            flush(topicPartition, tenantBuffers, acknowledgment, consumer);
        }

    }


    private PartitionBuffer newBuffer(TopicPartition topicPartition) {
        return new PartitionBuffer(topicPartition, appProperties.buffer().maxBytes(), appProperties.buffer().maxAge());
    }

    private void flush(
            TopicPartition topicPartition,
            Map<String, PartitionBuffer> tenantBuffers,
            Acknowledgment acknowledgment,
            Consumer<String, byte[]> consumer
    ) {
        for (Map.Entry<String, PartitionBuffer> entry : tenantBuffers.entrySet()) {
            String tenantId = entry.getKey();
            PartitionBuffer buffer = entry.getValue();

            if (buffer.isEmpty()) {
                continue;
            }

            long replayOffset = buffer.startOffset();
            BlobPayloadChunk chunk = buffer.toChunk();
            try {
                chunkFlushService.flush(chunk);
                commitOffset(topicPartition, buffer.nextOffsetToCommit(), acknowledgment, consumer);
                log.info("Flushed chunk {} for tenant {} containing {} records and {} bytes",
                        chunk.id(), tenantId, chunk.recordCount(), chunk.chunkSize());
                buffer.clear();
            } catch (RuntimeException ex) {
                buffer.clear();
                consumer.seek(topicPartition, replayOffset);
                throw ex;
            }
        }
    }

    private void commitOffset(
            TopicPartition topicPartition,
            long nextOffset,
            Acknowledgment acknowledgment,
            Consumer<String, byte[]> consumer
    ) {
        if (acknowledgment != null) {
            acknowledgment.acknowledge();
            return;
        }
        consumer.commitSync(Map.of(topicPartition, new OffsetAndMetadata(nextOffset)));
    }
}
