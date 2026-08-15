package org.design.behavioral.pattern.templatemethod;

public class Test {
    public static void main(String[] args) {
        AbstractClass template1 = new ConcreteClassA();
        AbstractClass template2 = new ConcreteClassB();

        System.out.println("Executing Template 1:");
        template1.templateMethod();
        System.out.println("\nExecuting Template 2:");
        template2.templateMethod();
    }
}
