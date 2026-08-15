package org.design.behavioral.pattern.iterator1;

public class Order {
    private String name;
    private double price;

    public Order(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
