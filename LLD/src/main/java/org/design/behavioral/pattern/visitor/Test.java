package org.design.behavioral.pattern.visitor;

public class Test {
    public static void main(String[] args) {
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();
        Visitor visitor = new ConcreteVisitor();

        elementA.accept(visitor);

        elementB.accept(visitor);
    }
}
