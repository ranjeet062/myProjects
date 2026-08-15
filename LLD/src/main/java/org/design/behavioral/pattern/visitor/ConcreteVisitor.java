package org.design.behavioral.pattern.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.println("Visiting ElementA" + element.operationA());
        // Perform operations specific to ElementA
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("Visiting ElementB" + element.operationB());
        // Perform operations specific to ElementB
    }
}
