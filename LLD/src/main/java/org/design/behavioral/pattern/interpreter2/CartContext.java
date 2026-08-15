package org.design.behavioral.pattern.interpreter2;

public class CartContext {
    private double total;

    private String country;

    private boolean isPrime;

    public CartContext(double total,String country, boolean isPrime) {
        this.total = total;
        this.country = country;
        this.isPrime = isPrime;
    }
    public double getTotal() {
        return total;
    }
    public String getCountry() {
        return country;
    }
    public boolean isPrime() {
        return isPrime;
    }
}
