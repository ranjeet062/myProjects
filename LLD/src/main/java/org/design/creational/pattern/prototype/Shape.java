package org.design.creational.pattern.prototype;

public interface Shape extends Cloneable {
    void draw();
    Shape clone();
}
