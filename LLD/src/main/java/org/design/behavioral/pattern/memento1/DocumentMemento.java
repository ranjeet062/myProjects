package org.design.behavioral.pattern.memento1;

// Memento class to store the state of the Document
public class DocumentMemento {
    private final String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
