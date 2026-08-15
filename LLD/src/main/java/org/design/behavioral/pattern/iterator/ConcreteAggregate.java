package org.design.behavioral.pattern.iterator;

import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private final List<T> items;
    private int size = 0;

    public ConcreteAggregate(List<T> items) {
        this.items = items;
        this.size = items.size();
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
    public int getSize() {
        return size;
    }
}
