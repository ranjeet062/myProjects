package org.design.behavioral.pattern.chainofresponsibility;

public class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("A")) {
            System.out.println("ConcreteHandlerA handled the request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for the request: " + request);
        }
    }
}
