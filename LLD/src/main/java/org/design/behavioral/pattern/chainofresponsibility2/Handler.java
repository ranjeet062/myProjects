package org.design.behavioral.pattern.chainofresponsibility2;

public abstract class Handler {
    protected Handler nextHandler;

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract void handleRequest(Request request);
}
