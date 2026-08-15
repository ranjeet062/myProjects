package org.design.behavioral.pattern.memento1;

// Memento Pattern - History Class
// Caretaker that maintains the history of states
public class History {
    private final java.util.Stack<DocumentMemento> mementoStack = new java.util.Stack<>();

    // Save the current state
    public void save(DocumentMemento memento) {
        mementoStack.push(memento);
    }

    // Restore the last saved state
    public DocumentMemento undo() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }
}
