package org.design.behavioral.pattern.iterator1;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
