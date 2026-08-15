package org.design.behavioral.pattern.chainofresponsibility;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerA();
        Handler handler2 = new ConcreteHandlerB();
        Handler handler3 = new ConcreteHandlerC();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handleRequest("A");
        handler1.handleRequest("B");
        handler1.handleRequest("C");


    }
}
