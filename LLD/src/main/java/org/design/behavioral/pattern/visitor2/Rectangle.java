package org.design.behavioral.pattern.visitor2;

public class Rectangle implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
