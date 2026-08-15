package com.example.kafkablobbuffer.consumer;

import com.example.kafkablobbuffer.service.PartitionBufferManager;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class KafkaPayloadConsumer {

    private final PartitionBufferManager partitionBufferManager;
    private volatile Consumer<String, byte[]> currentConsumer;

    public KafkaPayloadConsumer(PartitionBufferManager partitionBufferManager) {
        this.partitionBufferManager = partitionBufferManager;
    }

    @KafkaListener(topics = "${app.kafka.topic}", containerFactory = "kafkaListenerContainerFactory")
    public void consume(
            ConsumerRecord<String, byte[]> record,
            Acknowledgment acknowledgment,
            Consumer<String, byte[]> consumer
    ) {
        currentConsumer = consumer;
        partitionBufferManager.appendAndFlushIfNeeded(record, acknowledgment, consumer);
    }

}
