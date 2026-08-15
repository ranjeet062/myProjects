package org.design.structural.pattern.Facade;

public class TestOrderFacade {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("Laptop", 1, "Credit Card" , 1L, "Bangalore");
    }
}
