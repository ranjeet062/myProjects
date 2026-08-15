package org.design.structural.pattern.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueCircle = new Circle(new Blue());

        redCircle.draw();
        blueCircle.draw();

        Shape redTriangle = new Triangle(new Red());
        Shape blueTriangle = new Triangle(new Blue());
        redTriangle.draw();
        blueTriangle.draw();
    }
}
