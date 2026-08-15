package org.randomdesign;

import java.time.Instant;

public class CircuitBreaker {
    private enum State { CLOSED, OPEN, HALF_OPEN }

    private State state = State.CLOSED;
    private int failureCount = 0;
    private final int failureThreshold;
    private final long timeout;
    private Instant lastFailureTime;

    public CircuitBreaker(int failureThreshold, long timeout) {
        this.failureThreshold = failureThreshold;
        this.timeout = timeout;
    }

    public synchronized boolean allowRequest() {
        if (state == State.OPEN) {
            if (Instant.now().isAfter(lastFailureTime.plusMillis(timeout))) {
                state = State.HALF_OPEN;
                return true;
            }
            return false;
        }
        return true;
    }

    public synchronized void recordSuccess() {
        state = State.CLOSED;
        failureCount = 0;
    }

    public synchronized void recordFailure() {
        failureCount++;
        if (failureCount >= failureThreshold) {
            state = State.OPEN;
            lastFailureTime = Instant.now();
        }
    }

    public synchronized String getState() {
        return state.name();
    }
}