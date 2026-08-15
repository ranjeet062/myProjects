package org.design.behavioral.pattern.chainofresponsibility2;

public class DataValidationHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (isValid(request)) {
            System.out.println("DataValidationHandler: Data is valid.");
        } else {
            System.out.println("DataValidationHandler: Data is invalid. Stopping processing.");
            return;
        }
        if (nextHandler != null)
            nextHandler.handleRequest(request);
    }

    private boolean isValid(Request request) {
        // Implement your validation logic here
        return request.getData() != null && !request.getData().isEmpty();
    }
}
