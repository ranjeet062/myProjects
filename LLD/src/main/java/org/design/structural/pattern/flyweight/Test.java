package org.design.structural.pattern.flyweight;

public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get circle shapes from the factory
        Shape redCircle = shapeFactory.getShape();
        Shape blueCircle = shapeFactory.getShape();

        // Draw circles with different colors (extrinsic property)
        redCircle.draw("Red");
        blueCircle.draw("Blue");

        // Verify that both circle references point to the same object
        System.out.println("Are both circle references the same? " + (redCircle == blueCircle));
    }
}
