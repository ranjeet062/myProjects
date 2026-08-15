package org.design.creational.pattern.prototype;

public class Triangle implements Shape {
    private int radius;
    public Triangle(int radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Triangle with radius: " + radius);
    }
    @Override
    public Shape clone() {
        return new Triangle(this.radius);
    }
}
