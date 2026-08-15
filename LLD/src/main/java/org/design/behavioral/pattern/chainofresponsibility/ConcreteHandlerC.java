package org.design.behavioral.pattern.chainofresponsibility;

public class ConcreteHandlerC implements Handler {
    private Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("C")) {
            System.out.println("ConcreteHandlerC handled the request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Request " + request + " was not handled.");
        }
    }
}
