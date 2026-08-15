package com.example.kafkablobbuffer.model;

public record BlobPayloadChunk(
        String id,
        String topic,
        int partition,
        long startOffset,
        long endOffset,
        long chunkSize,
        int recordCount,
        String payloadType,
        byte[] content
) {
    public String blobName() {
        return topic + "/partition-" + partition + "/" + id + ".bin";
    }
}
