package org.design.behavioral.pattern.visitor2;

public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle();

        Visitor jsonVisitor = new JsonExportVisitor();
        Visitor printVisitor = new PrintVisitor();

        circle.accept(jsonVisitor);
        rectangle.accept(jsonVisitor);
        System.out.println("-------------");
        circle.accept(printVisitor);
        circle.accept(printVisitor);
    }
}
