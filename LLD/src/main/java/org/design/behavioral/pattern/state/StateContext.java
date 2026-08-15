package org.design.behavioral.pattern.state;

public class StateContext {
    private State state;

    public StateContext() {
    }
    public StateContext(State state) {
        this.state = state; // Initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}
