package org.design.behavioral.pattern.memento1;

// Memento Pattern Example: Document class (Originator)
public class Document {
    private String content;

    public DocumentMemento save() {
        return new DocumentMemento(content);
    }

    public void restore(DocumentMemento memento) {
        this.content = memento.getContent();
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
