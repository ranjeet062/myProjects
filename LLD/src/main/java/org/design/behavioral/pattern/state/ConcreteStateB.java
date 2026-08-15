package org.design.behavioral.pattern.state;

public class ConcreteStateB implements State{

    @Override
    public void handle() {
        System.out.println("Handling state B");
    }
}
