package org.design.behavioral.pattern.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
