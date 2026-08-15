package com.example.kafkablobbuffer.service;

import java.io.ByteArrayInputStream;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.example.kafkablobbuffer.model.BlobPayloadChunk;
import org.springframework.stereotype.Service;

@Service
public class BlobChunkWriter {

    private final BlobContainerClient containerClient;

    public BlobChunkWriter(BlobContainerClient containerClient) {
        this.containerClient = containerClient;
    }

    public String write(BlobPayloadChunk chunk) {
        BlobClient blobClient = containerClient.getBlobClient(chunk.blobName());
        BlobHttpHeaders headers = new BlobHttpHeaders().setContentType(chunk.payloadType());
        blobClient.upload(new ByteArrayInputStream(chunk.content()), chunk.content().length, true);
        blobClient.setHttpHeaders(headers);
        return blobClient.getBlobUrl();
    }
}
