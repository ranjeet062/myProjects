# Kafka Blob Buffer

Gradle-wrapper Spring Boot service that consumes Kafka byte-array payloads, buffers records independently per Kafka partition, and flushes each partition chunk when the first condition is reached:

- buffered payload bytes >= `20 MB`
- oldest record in the partition buffer is >= `60 seconds`

For every flush, the service:

1. uploads the serialized chunk to Azure Blob Storage
2. writes chunk metadata to Elasticsearch
3. commits the Kafka offset only after both steps succeed

If blob upload or Elasticsearch indexing fails, the service does not commit the Kafka offset and seeks the consumer back to the first offset in the failed chunk so Kafka can replay the payload.

## Transaction Boundary

Kafka, Azure Blob Storage, and Elasticsearch do not provide one shared atomic transaction manager. This service implements the practical transactional boundary as:

- Kafka auto-commit disabled
- manual immediate Kafka acknowledgments
- deterministic chunk IDs and blob names based on topic, partition, offset range, and checksum
- overwrite-safe blob writes and Elasticsearch upserts by chunk ID
- no Kafka offset commit until blob storage and Elasticsearch writes both return successfully

A retry can repeat blob or metadata writes after a partial failure, but it targets the same chunk identity instead of creating unrelated duplicate chunks.

## Metadata

Each Elasticsearch document contains:

- `id`
- `topic`
- `partition`
- `startOffset`
- `endOffset`
- `blobOffset`
- `chunkSize`
- `recordCount`
- `payloadType`
- `status`
- `blobUrl`
- `createdAt`

## Configuration

Environment variables:

```text
KAFKA_BOOTSTRAP_SERVERS=localhost:9092
KAFKA_GROUP_ID=kafka-blob-buffer
KAFKA_TOPIC=payload-topic
KAFKA_CONCURRENCY=3
BUFFER_MAX_BYTES=20971520
BUFFER_MAX_AGE=60s
PAYLOAD_TYPE_HEADER=payloadType
AZURE_STORAGE_CONNECTION_STRING=UseDevelopmentStorage=true
AZURE_STORAGE_CONTAINER=kafka-payload-chunks
ELASTICSEARCH_URIS=http://localhost:9200
ELASTICSEARCH_INDEX=kafka-payload-chunk-metadata
```

## Build

```bash
./gradlew build
```

On Windows PowerShell:

```powershell
.\gradlew.bat build
```

## Run

```bash
./gradlew bootRun
```

On Windows PowerShell:

```powershell
.\gradlew.bat bootRun
```