package org.design.behavioral.pattern.state;

public class Test {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();

        context.setState(stateA);
        context.request();

        context.setState(stateB);
        context.request();
    }
}
