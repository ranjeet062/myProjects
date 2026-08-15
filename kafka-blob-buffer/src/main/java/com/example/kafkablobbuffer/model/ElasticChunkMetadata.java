package com.example.kafkablobbuffer.model;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "#{@appProperties.elasticsearch().indexName()}")
public record ElasticChunkMetadata(
        @Id String id,
        String topic,
        int partition,
        long startOffset,
        long endOffset,
        long blobOffset,
        long chunkSize,
        int recordCount,
        String payloadType,
        String status,
        String blobUrl,
        Instant createdAt
) {
}
