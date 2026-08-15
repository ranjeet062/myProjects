package org.design.creational.pattern.singleton;

public class DoubleCheckedLockingSingleton {
    // Volatile variable to ensure visibility of changes across threads
    private static volatile DoubleCheckedLockingSingleton instance;

    // Private constructor to prevent instantiation
    private DoubleCheckedLockingSingleton() {
        System.out.println("DoubleCheckedLockingSingleton instance created");
    }

    // Public method to provide access to the instance
    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from DoubleCheckedLockingSingleton!");
    }
}