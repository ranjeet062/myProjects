package org.design.behavioral.pattern.strategy1;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 0.50; // Standard shipping cost per unit weight
    }
}
