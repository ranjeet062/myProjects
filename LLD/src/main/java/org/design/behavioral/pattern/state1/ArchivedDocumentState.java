package org.design.behavioral.pattern.state1;

public class ArchivedDocumentState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("Document is archived and cannot be published.");
    }

    @Override
    public void archive(Document document) {
        System.out.println("Document is already archived.");
    }
}
