package org.design.behavioral.pattern.templatemethod;

public class ConcreteClassA extends AbstractClass {


    @Override
    protected void stepOne() {
        System.out.println("ConcreteClassA: Implementing step one.");
    }

    @Override
    protected void stepTwo() {
    System.out.println("ConcreteClassA: Implementing step two.");
    }
}
