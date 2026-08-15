package org.design.behavioral.pattern.chainofresponsibility;

public interface Handler {
    void setNextHandler(Handler nextHandler);

    void handleRequest(String request);
}
