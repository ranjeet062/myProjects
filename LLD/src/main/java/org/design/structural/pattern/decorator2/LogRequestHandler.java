package org.design.structural.pattern.decorator2;

public class LogRequestHandler extends RequestHandlerDecorator {
    public LogRequestHandler(RequestHandler wrapper) {
        super(wrapper);
    }

    @Override
    public void sendRequest(String request) {
        // Add logging logic here
        System.out.println("Logging request: " + request);
        super.sendRequest(request);
    }
}
