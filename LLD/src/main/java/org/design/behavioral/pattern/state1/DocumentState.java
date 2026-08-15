package org.design.behavioral.pattern.state1;

public interface DocumentState {
    void publish(Document context);
    void archive(Document context);
}
