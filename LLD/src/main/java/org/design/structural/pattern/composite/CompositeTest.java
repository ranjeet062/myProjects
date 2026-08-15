package org.design.structural.pattern.composite;

public class CompositeTest {
    public static void main(String[] args) {
        // Create individual graphics
        Graphic circle1 = new Circle();
        Graphic rectangle1 = new Rectangle();
        Graphic circle2 = new Circle();

        // Create a composite graphic
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(circle1);
        compositeGraphic.add(rectangle1);

        // Create another composite graphic
        CompositeGraphic mainComposite = new CompositeGraphic();
        mainComposite.add(compositeGraphic);
        mainComposite.add(circle2);

        // Draw all graphics
        mainComposite.draw();
    }
}
