package org.design.creational.pattern.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle(10, 20);
        Shape rectangle2 = rectangle1.clone();

        Shape triangle1 = new Triangle(15);
        Shape triangle2 = triangle1.clone();

        Shape square1 = new Square(5);
        Shape square2 = square1.clone();

        rectangle1.draw();
        rectangle2.draw();

        triangle1.draw();
        triangle2.draw();

        square1.draw();
        square2.draw();

    }
}
