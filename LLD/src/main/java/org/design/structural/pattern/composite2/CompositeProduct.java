package org.design.structural.pattern.composite2;

public class CompositeProduct implements Product{
    private String name;
    private java.util.List<Product> products = new java.util.ArrayList<>();

    public CompositeProduct(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public double getPrice() {
        double sum = 0.0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        System.out.println("Composite Product: " + name + ", Total Price: $" + sum);
        return sum;
    }
}
