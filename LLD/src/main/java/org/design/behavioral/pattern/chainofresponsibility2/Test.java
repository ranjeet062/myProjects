package org.design.behavioral.pattern.chainofresponsibility2;

public class Test {
    public static void main(String[] args) {
        Handler authHandler = new AuthHandler();
        Handler permissionHandler = new PermissionHandler();
        Handler dataHandler = new DataValidationHandler();

        authHandler.setNextHandler(permissionHandler);
        permissionHandler.setNextHandler(dataHandler);

        Request request = new Request("token", "read", "Admin");
        authHandler.handleRequest(request);

        System.out.println("--------------------------------------");
        System.out.println("Testing with missing data:");
        Request request1 = new Request("token", null, "Admin");
        authHandler.handleRequest(request1);


        System.out.println("--------------------------------------");
        System.out.println("Testing with missing auth/token:");
        Request request2 = new Request(null, "data", "Admin");
        authHandler.handleRequest(request2);

        System.out.println("--------------------------------------");
        System.out.println("Testing with missing permission:");
        Request request3 = new Request("token", "data", null);
        authHandler.handleRequest(request3);

    }
}
