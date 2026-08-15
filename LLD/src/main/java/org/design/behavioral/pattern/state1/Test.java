package org.design.behavioral.pattern.state1;

public class Test {
    public static void main(String[] args) {
        Document document = new Document();

        DraftDocumentState draftState = new DraftDocumentState();
        PublishDocumentState publishState = new PublishDocumentState();
        ArchivedDocumentState archivedState = new ArchivedDocumentState();

        document.setState(draftState);
        document.publish();
        document.archive();
        document.setState(publishState);
        document.publish();
        document.archive();
        document.setState(archivedState);
        document.publish();
        document.archive();
    }
}
