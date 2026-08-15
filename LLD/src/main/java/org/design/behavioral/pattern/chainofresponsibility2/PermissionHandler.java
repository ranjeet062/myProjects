package org.design.behavioral.pattern.chainofresponsibility2;

public class PermissionHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRole() != "Admin") {
            System.out.println("PermissionHandler: Access denied for role " + request.getRole());
            return;
        } else {
            System.out.println("PermissionHandler: Access granted for role " + request.getRole());
        }

        if (nextHandler != null)
            nextHandler.handleRequest(request);
    }
}
