package org.design.structural.pattern.proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        System.out.println("Proxy: Logging access before forwarding request.");
        realSubject.request();
    }
}
