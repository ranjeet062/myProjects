package org.design.structural.pattern.decorator2;

public class DecoratorTest {
    public static void main(String[] args) {
        RequestHandler handler = new BasicRequestHandler();
        RequestHandler authHandler = new AuthRequestHandler(handler);
        RequestHandler loggingAuthHandler = new LogRequestHandler(authHandler);
        loggingAuthHandler.sendRequest("GET /api/data");

        System.out.println("--------------------------------------");
        RequestHandler handler1 = new LogRequestHandler(new AuthRequestHandler(new BasicRequestHandler()));
        handler1.sendRequest("POST /api/submit");
    }
}
