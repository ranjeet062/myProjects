package org.design.behavioral.pattern.visitor;

public interface Element {
    void accept(Visitor visitor);
}
