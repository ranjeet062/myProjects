package org.design.behavioral.pattern.state;

public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("Handling state A");
    }
}
