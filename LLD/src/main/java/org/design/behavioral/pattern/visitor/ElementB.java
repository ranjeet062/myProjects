package org.design.behavioral.pattern.visitor;

public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
        public String operationB() {
            return "ElementB operation";
        }
}
