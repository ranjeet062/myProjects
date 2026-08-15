package org.design.behavioral.pattern.iterator1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        OrderAggregate<String > orderAggregate = new OrderAggregate<String>(Arrays.asList("Order1", "Order2", "Order3", "Order4"));
        Iterator<String> orderIterator = orderAggregate.createIterator();
        while (orderIterator.hasNext()) {
            String order = orderIterator.next();
           // System.out.println("Processing " + order);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("If Rayansh would be good boy in his school. then he will get these items on his birthday");
        OrderAggregate<Order> orderAggregate1 = new OrderAggregate<Order>(Arrays.asList(new Order("Pizza", 1000), new Order("Books", 200), new Order("Toys", 30), new Order("Outside Ghumi", 5000)));
        Iterator<Order> orderIterator1 = orderAggregate1.createIterator();
        double totalAmount = 0;
        while (orderIterator1.hasNext()) {
            Order order = orderIterator1.next();
            System.out.println("Processing order: " + order.getName() + " with amount: " + order.getPrice() +"Rs.");
            totalAmount += order.getPrice();
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Total amount for all orders: " + totalAmount + "Rs.");
        System.out.println("--------------------------------------------------------------");

    }

}
