package org.design.behavioral.pattern.interpreter2;

// Terminal Expression
public class IsPrime implements Expression {
    @Override
    public boolean interpret(CartContext context) {
        return context.isPrime();
    }
}
