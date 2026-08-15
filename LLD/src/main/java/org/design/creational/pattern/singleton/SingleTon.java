package org.design.creational.pattern.singleton;

public class SingleTon {
    private static SingleTon instance;
    private  String appName;

    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    private SingleTon() {
        // private constructor to prevent instantiation
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}
