package org.design.structural.pattern.decorator2;

public class BasicRequestHandler implements RequestHandler {
    @Override
    public void sendRequest(String request) {
        System.out.println("Sending Basic request: " + request);
    }
}
