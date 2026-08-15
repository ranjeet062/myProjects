package org.design.behavioral.pattern.visitor2;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
