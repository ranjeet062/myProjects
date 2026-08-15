package org.design.behavioral.pattern.templatemethod;

public class ConcreteClassB extends AbstractClass {

    @Override
    protected void stepOne() {
        System.out.println("ConcreteClassB: Step One Implementation");
    }

    @Override
    protected void stepTwo() {
        System.out.println("ConcreteClassB: Step Two Implementation");
    }

    @Override
    protected void stepThree() {
        System.out.println("ConcreteClassB: Step Three Implementation");
    }
}
