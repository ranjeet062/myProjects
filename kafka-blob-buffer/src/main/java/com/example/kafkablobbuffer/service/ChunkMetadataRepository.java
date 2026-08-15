package com.example.kafkablobbuffer.service;

import com.example.kafkablobbuffer.model.ElasticChunkMetadata;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ChunkMetadataRepository extends ElasticsearchRepository<ElasticChunkMetadata, String> {
}
