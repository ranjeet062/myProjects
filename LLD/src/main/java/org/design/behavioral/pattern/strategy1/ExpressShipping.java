package org.design.behavioral.pattern.strategy1;

public class ExpressShipping implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double weight) {
        return 1.0 * weight; // Example calculation for express shipping based on weight only
    }
}
