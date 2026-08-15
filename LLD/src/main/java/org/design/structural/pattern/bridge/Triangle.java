package org.design.structural.pattern.bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle with color: " + color.applyColor());
    }
}
