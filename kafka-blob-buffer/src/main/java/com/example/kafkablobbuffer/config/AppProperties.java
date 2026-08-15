package com.example.kafkablobbuffer.config;

import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public record AppProperties(
        Buffer buffer
) {
    public record Buffer(long maxBytes, Duration maxAge, String payloadTypeHeader) {
    }

}
