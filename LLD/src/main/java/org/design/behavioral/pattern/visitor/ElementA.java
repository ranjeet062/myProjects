package org.design.behavioral.pattern.visitor;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "ElementA operation";
    }
}
