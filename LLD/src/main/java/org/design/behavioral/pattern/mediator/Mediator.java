package org.design.behavioral.pattern.mediator;

public interface Mediator {
    void notify(Colleague colleague, String event);
}
