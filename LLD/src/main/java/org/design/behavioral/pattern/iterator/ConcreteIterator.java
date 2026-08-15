package org.design.behavioral.pattern.iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private final List<T> aggregate;
    private int currentIndex = 0;

    public ConcreteIterator(List<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < aggregate.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more elements in the collection.");
        }
        return aggregate.get(currentIndex++);
    }
}
