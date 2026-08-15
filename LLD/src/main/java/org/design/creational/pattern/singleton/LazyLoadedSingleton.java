package org.design.creational.pattern.singleton;

public class LazyLoadedSingleton {
    private LazyLoadedSingleton() {
        // private constructor to prevent instantiation
        System.out.println("LazyLoadedSingleton instance created");
    }

    private static class LazyLoadedSingletonHelper {
        private static final LazyLoadedSingleton INSTANCE = new LazyLoadedSingleton();
    }

    public static LazyLoadedSingleton getInstance() {
        return LazyLoadedSingletonHelper.INSTANCE;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from LazyLoadedSingleton!");
    }
}
