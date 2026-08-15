package org.design.behavioral.pattern.visitor2;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Circle circle) {
      System.out.println("Visiting Circle");

    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Visiting Rectangle");
    }
}
