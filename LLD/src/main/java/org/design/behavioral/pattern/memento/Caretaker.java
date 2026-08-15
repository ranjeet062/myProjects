package org.design.behavioral.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
