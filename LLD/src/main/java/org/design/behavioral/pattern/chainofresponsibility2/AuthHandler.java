package org.design.behavioral.pattern.chainofresponsibility2;

public class AuthHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getToken() == null) {
            System.out.println("Auth validation failed: " + request.getRole());
            return;
        } else {
            System.out.println("Auth validation passed: " + request.getRole());
        }
        if (nextHandler != null)
            nextHandler.handleRequest(request);
    }
}
