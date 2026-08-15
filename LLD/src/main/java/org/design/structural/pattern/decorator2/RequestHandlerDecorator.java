package org.design.structural.pattern.decorator2;

public abstract class RequestHandlerDecorator implements RequestHandler {
    protected RequestHandler wrapper;

    public RequestHandlerDecorator(RequestHandler wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void sendRequest(String request) {
        wrapper.sendRequest(request);
    }
}
