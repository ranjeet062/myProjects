package org.design.structural.pattern.proxy;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
