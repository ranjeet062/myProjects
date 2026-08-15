package org.design.structural.pattern.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle with color: " + color.applyColor());
    }
}
