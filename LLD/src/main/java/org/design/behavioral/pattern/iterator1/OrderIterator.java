package org.design.behavioral.pattern.iterator1;

import java.util.List;

public class OrderIterator<T> implements Iterator<T> {
    private final List<T> items;
    private int position = 0;

    public OrderIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        return items.get(position++);
    }
}
