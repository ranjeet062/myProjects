package org.design.behavioral.pattern.strategy1;

public class ShippingService {
    private ShippingStrategy shippingStrategy;

    public ShippingService(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }
    public double calculateShippingCost(double weight) {
        return shippingStrategy.calculateShippingCost(weight);
    }
}
