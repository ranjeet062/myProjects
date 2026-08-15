package org.design.behavioral.pattern.visitor2;

public class JsonExportVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Exporting Circle to JSON format.");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Exporting Rectangle to JSON format.");
    }
}
