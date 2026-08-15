package org.design.behavioral.pattern.state1;

// Context class
public class Document {
    private DocumentState state;

    public Document() {
        this.state = new DraftDocumentState(); // Initial state
    }
    public Document(DocumentState state) {
        this.state = state;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);
    }

    public void archive() {
        state.archive(this);
    }
}
