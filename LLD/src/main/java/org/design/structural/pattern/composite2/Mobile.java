package org.design.structural.pattern.composite2;

public class Mobile implements Product {
    private String name;
    private double price;

    public Mobile(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        System.out.println("Mobile: " + name + ", Price: $" + price);
        return price;
    }
}
