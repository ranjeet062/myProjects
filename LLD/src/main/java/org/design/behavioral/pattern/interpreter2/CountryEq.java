package org.design.behavioral.pattern.interpreter2;

// Terminal Expression
public class CountryEq implements Expression {
    private String country;

    public CountryEq(String country) {
        this.country = country;
    }

    @Override
    public boolean interpret(CartContext context) {
        return context.getCountry().equalsIgnoreCase(country);
    }
}
