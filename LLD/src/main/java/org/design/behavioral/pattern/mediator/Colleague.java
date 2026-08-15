package org.design.behavioral.pattern.mediator;

public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    abstract void receive(String message);
    abstract void send(String message);
}
