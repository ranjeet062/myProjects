package org.design.creational.pattern.prototype;

import java.util.Set;

public class Square implements Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square with side length: " + sideLength);
    }

    @Override
    public Shape clone() {
        return new Square(this.sideLength);
    }
}
