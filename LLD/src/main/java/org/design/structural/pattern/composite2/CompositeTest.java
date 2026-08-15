package org.design.structural.pattern.composite2;

public class CompositeTest {
    public static void main(String[] args) {
        Product mobile1 = new Mobile("iPhone 13", 999.99);
        Product mobile2 = new Mobile("Samsung Galaxy S21", 799.99);
        Product laptop1 = new Laptop("MacBook Pro", 1299.99);
        Product laptop2 = new Laptop("Dell XPS 13", 999.99);

        CompositeProduct electronics = new CompositeProduct("Electronics");
        electronics.addProduct(mobile1);
        electronics.addProduct(mobile2);
        electronics.addProduct(laptop1);
        electronics.addProduct(laptop2);
        System.out.println("Total: $" +electronics.getPrice());
    }
}
