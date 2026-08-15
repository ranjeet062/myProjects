package org.design.structural.pattern.flyweight;

public class Circle implements Shape {
    private final String intrinsicProperty; // Intrinsic property

    public Circle() {
        this.intrinsicProperty = "CIRCLE";
    }

    @Override
    public void draw(String color) { // Extrinsic property passed as parameter
        System.out.println("Drawing Circle with intrinsic property: " + intrinsicProperty + " and extrinsic property color: " + color);
    }
}
