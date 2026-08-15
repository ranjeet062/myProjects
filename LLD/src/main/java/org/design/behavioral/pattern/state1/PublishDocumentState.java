package org.design.behavioral.pattern.state1;

public class PublishDocumentState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("Document is already published.");
    }

    @Override
    public void archive(Document document) {
        document.setState(new ArchivedDocumentState());
        System.out.println("Document archived.");
    }
}
