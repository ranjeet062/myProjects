package com.example.kafkablobbuffer.service;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

import com.example.kafkablobbuffer.model.BufferedRecord;
import com.example.kafkablobbuffer.model.BlobPayloadChunk;
import org.apache.kafka.common.TopicPartition;

public class PartitionBuffer {

    private static final byte[] MAGIC = "KAFKA_CHUNK_V1\n".getBytes(StandardCharsets.UTF_8);

    private final TopicPartition topicPartition;
    private final long maxBytes;
    private final Duration maxAge;
    private final List<BufferedRecord> records = new ArrayList<>();
    private long bytes;
    private Instant openedAt;

    public PartitionBuffer(TopicPartition topicPartition, long maxBytes, Duration maxAge) {
        this.topicPartition = topicPartition;
        this.maxBytes = maxBytes;
        this.maxAge = maxAge;
    }

    public void append(BufferedRecord record) {
        if (records.isEmpty()) {
            openedAt = Instant.now();
        }
        records.add(record);
        bytes += record.payloadSize();
    }

    public boolean shouldFlush() {
        return !records.isEmpty() && (bytes >= maxBytes || isExpired());
    }

    public boolean isExpired() {
        return openedAt != null && !Instant.now().isBefore(openedAt.plus(maxAge));
    }

    public boolean isEmpty() {
        return records.isEmpty();
    }

    public long startOffset() {
        return records.get(0).offset();
    }

    public long nextOffsetToCommit() {
        return records.get(records.size() - 1).offset() + 1;
    }

    public BlobPayloadChunk toChunk() {
        long startOffset = startOffset();
        long endOffset = records.get(records.size() - 1).offset();
        String payloadType = records.stream()
                .map(BufferedRecord::payloadType)
                .distinct()
                .limit(2)
                .count() == 1 ? records.get(0).payloadType() : "mixed";
        byte[] content = serialize();
        String id = chunkId(topicPartition.topic(), topicPartition.partition(), startOffset, endOffset, content);
        return new BlobPayloadChunk(
                id,
                topicPartition.topic(),
                topicPartition.partition(),
                startOffset,
                endOffset,
                content.length,
                records.size(),
                payloadType,
                content
        );
    }

    public void clear() {
        records.clear();
        bytes = 0;
        openedAt = null;
    }

    private byte[] serialize() {
        ByteArrayOutputStream out = new ByteArrayOutputStream(Math.toIntExact(Math.min(Integer.MAX_VALUE, bytes + 1024)));
        out.writeBytes(MAGIC);
        for (BufferedRecord record : records) {
            byte[] key = record.key() == null ? new byte[0] : record.key().getBytes(StandardCharsets.UTF_8);
            byte[] payloadType = record.payloadType().getBytes(StandardCharsets.UTF_8);
            byte[] payload = record.payload() == null ? new byte[0] : record.payload();
            out.writeBytes(ByteBuffer.allocate(Long.BYTES).putLong(record.offset()).array());
            out.writeBytes(ByteBuffer.allocate(Integer.BYTES).putInt(key.length).array());
            out.writeBytes(key);
            out.writeBytes(ByteBuffer.allocate(Integer.BYTES).putInt(payloadType.length).array());
            out.writeBytes(payloadType);
            out.writeBytes(ByteBuffer.allocate(Integer.BYTES).putInt(payload.length).array());
            out.writeBytes(payload);
        }
        return out.toByteArray();
    }

    private static String chunkId(String topic, int partition, long startOffset, long endOffset, byte[] content) {
        CRC32 crc32 = new CRC32();
        crc32.update(content);
        return topic + "-" + partition + "-" + startOffset + "-" + endOffset + "-" + Long.toHexString(crc32.getValue());
    }
}
