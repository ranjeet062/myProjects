package com.example.kafkablobbuffer.config;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlobConfig {

    @Bean
    BlobContainerClient blobContainerClient(AppProperties appProperties) {
        BlobContainerClient containerClient = new BlobServiceClientBuilder()
                .connectionString(appProperties.blob().connectionString())
                .buildClient()
                .getBlobContainerClient(appProperties.blob().containerName());
        containerClient.createIfNotExists();
        return containerClient;
    }
}
