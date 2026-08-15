package org.design.structural.pattern.flyweight;

public class ShapeFactory {
    private static final java.util.Map<String, Shape> shapeMap = new java.util.HashMap<>();
    public static Shape getShape() {
        Shape shape = shapeMap.get("CIRCLE");
        if (shape == null) {
            shape = new Circle();
            shapeMap.put("CIRCLE", shape);
        }
        return shape;
    }
}
