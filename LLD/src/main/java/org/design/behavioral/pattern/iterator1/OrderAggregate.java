package org.design.behavioral.pattern.iterator1;

import java.util.List;

public class OrderAggregate<T> implements Aggregate<T> {
    private List<T> items;
    private int size = 0;

    public OrderAggregate(List<T> itemList) {
        this.items = itemList;
        this.size = itemList.size();
    }
    public void addItem(T item) {
        if (size < items.size()) {
            items.add(item);
        }
    }

    @Override
    public Iterator<T> createIterator() {
        return new OrderIterator<>(items);
    }
}
