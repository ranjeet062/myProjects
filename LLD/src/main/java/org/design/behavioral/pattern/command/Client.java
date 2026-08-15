package org.design.behavioral.pattern.command;

public class Client {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        PlaceOrderCommand placeOrder = new PlaceOrderCommand(orderService);
        CancelOrderCommand cancelOrder = new CancelOrderCommand(orderService);
        OrderInvoker orderInvoker = new OrderInvoker(placeOrder);
        orderInvoker.execute();

        orderInvoker.setCommand(cancelOrder);
        orderInvoker.execute();
    }
}
