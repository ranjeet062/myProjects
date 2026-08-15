package org.design.structural.pattern.decorator2;

public class AuthRequestHandler extends RequestHandlerDecorator {
    public AuthRequestHandler(RequestHandler wrapper) {
        super(wrapper);
    }

    @Override
    public void sendRequest(String request) {
        // Add authentication logic here
        System.out.println("Authenticating request: " + request);
        super.sendRequest(request);
    }
}
