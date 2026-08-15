package org.design.structural.pattern.Facade;

public class PaymentService {
    public void processPayment(String paymentType, double amount) {
        System.out.println("Processing " + paymentType + " payment of amount: $" + amount);
    }
}
