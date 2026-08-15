package org.design.behavioral.pattern.strategy1;

public class Test {

    public static void main(String[] args) {
        StandardShipping standardShipping = new StandardShipping();
        ExpressShipping expressShipping = new ExpressShipping();
        ShippingService shippingService = new ShippingService(standardShipping);
        System.out.println("Std shipping cost: " + shippingService.calculateShippingCost(10));
        shippingService.setShippingStrategy(expressShipping);
        System.out.println("Exp shipping cost: " + shippingService.calculateShippingCost(10));
    }
}
