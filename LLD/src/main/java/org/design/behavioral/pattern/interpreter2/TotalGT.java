package org.design.behavioral.pattern.interpreter2;

// Terminal expression
public class TotalGT implements Expression {
    private double amount;
    public TotalGT(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean interpret(CartContext context) {
        return context.getTotal() > amount;
    }
}
