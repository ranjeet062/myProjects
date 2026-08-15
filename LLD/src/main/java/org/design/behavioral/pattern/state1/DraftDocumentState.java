package org.design.behavioral.pattern.state1;

public class DraftDocumentState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("Publishing the document...");
        document.setState(new DraftDocumentState());
    }

    @Override
    public void archive(Document document) {
        System.out.println("Cannot archive a draft document.");
    }

}
