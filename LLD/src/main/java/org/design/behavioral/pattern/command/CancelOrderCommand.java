package org.design.behavioral.pattern.command;

public class CancelOrderCommand implements Command {
    private OrderService orderService;

    public CancelOrderCommand(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void execute() {
        orderService.cancelOrder();
    }
}
