package org.design.behavioral.pattern.memento1;

public class Test {

    public static void main(String[] args) {
        // caretaker
        History history = new History();

        // originator
        Document doc = new Document();
        doc.setContent("Version 1");
        history.save(doc.save());

        doc.setContent("Version 2");
        history.save(doc.save());

        doc.setContent("Version 3");

        System.out.println("Current Content: " + doc.getContent());
        doc.restore(history.undo());
        System.out.println("After Undo Content: " + doc.getContent());

        doc.restore(history.undo());
        System.out.println("After Second Undo Content: " + doc.getContent());


    }
}
