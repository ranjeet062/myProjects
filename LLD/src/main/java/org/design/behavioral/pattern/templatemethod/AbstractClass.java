package org.design.behavioral.pattern.templatemethod;

public abstract class AbstractClass {
    public void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
    }

    protected abstract void stepOne();

    protected abstract void stepTwo();

    protected void stepThree(){
        System.out.println("Default implementation of step three.");
    }
}
