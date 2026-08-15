package org.design.structural.pattern.composite2;

public class Laptop implements Product {
    private String name;
    private double price;

    public Laptop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        System.out.println("Laptop: " + name + ", Price: $" + price);
        return price;
    }
}
