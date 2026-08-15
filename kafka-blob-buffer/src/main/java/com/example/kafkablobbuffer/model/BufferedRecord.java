package com.example.kafkablobbuffer.model;

import java.nio.charset.StandardCharsets;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.header.Header;

public record BufferedRecord(
        long offset,
        String key,
        byte[] payload,
        String payloadType
) {
    public static BufferedRecord from(ConsumerRecord<String, byte[]> record, String payloadTypeHeader) {
        Header header = record.headers().lastHeader(payloadTypeHeader);
        String payloadType = header == null ? "application/octet-stream" : new String(header.value(), StandardCharsets.UTF_8);
        return new BufferedRecord(record.offset(), record.key(), extractPayloadRef(record), payloadType);
    }

    private static byte[] extractPayloadRef(ConsumerRecord<String, byte[]> record) {
        byte[] value = record.value(); // writ logic to get the PayloadRef
        if (value == null) {
            return null;
        }
        return value;

    }

    public int payloadSize() {
        return payload == null ? 0 : payload.length;
    }
}
