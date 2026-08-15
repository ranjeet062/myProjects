package com.example.kafkablobbuffer.service;

import java.time.Instant;

import com.example.kafkablobbuffer.model.ElasticChunkMetadata;
import com.example.kafkablobbuffer.model.BlobPayloadChunk;
import org.springframework.stereotype.Service;

@Service
public class ChunkFlushService {

    private final BlobChunkWriter blobChunkWriter;
    private final ChunkMetadataRepository metadataRepository;

    public ChunkFlushService(BlobChunkWriter blobChunkWriter, ChunkMetadataRepository metadataRepository) {
        this.blobChunkWriter = blobChunkWriter;
        this.metadataRepository = metadataRepository;
    }

    public ElasticChunkMetadata flush(BlobPayloadChunk chunk) {
        String blobUrl = blobChunkWriter.write(chunk);
        ElasticChunkMetadata metadata = new ElasticChunkMetadata(
                chunk.id(),
                chunk.topic(),
                chunk.partition(),
                chunk.startOffset(),
                chunk.endOffset(),
                chunk.startOffset(),
                chunk.chunkSize(),
                chunk.recordCount(),
                chunk.payloadType(),
                "COMPLETED",
                blobUrl,
                Instant.now()
        );
        return metadataRepository.save(metadata);
    }
}
