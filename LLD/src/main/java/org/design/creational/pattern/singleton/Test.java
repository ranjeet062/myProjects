package org.design.creational.pattern.singleton;

import org.design.creational.pattern.singleton.DoubleCheckedLockingSingleton;
import org.design.creational.pattern.singleton.LazyLoadedSingleton;
import org.design.creational.pattern.singleton.SingleTon;

public class Test {
    public static void main(String[] args) {
        SingleTon singleton1 = SingleTon.getInstance();
        singleton1.setAppName("MyApplication");
        SingleTon singleton2 = SingleTon.getInstance();
        singleton2.setAppName("MyNewApplication");

        System.out.println("App Name from singleton1: " + singleton1.getAppName());
        System.out.println("App Name from singleton2: " + singleton2.getAppName());

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Instances are different. Singleton pattern failed!");
        }
        SingleTon singleton3 = SingleTon.getInstance();
        singleton3.setAppName("MyNew3Application");
        System.out.println("App Name from singleton3: " + singleton3.getAppName());

        if (singleton1 == singleton3) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Instances are different. Singleton pattern failed!");
        }

        System.out.println("-------------------------------------------------");
        LazyLoadedSingleton instance1 = LazyLoadedSingleton.getInstance();
        instance1.showMessage();

        LazyLoadedSingleton instance2 = LazyLoadedSingleton.getInstance();
        System.out.println("Are both instances the same? " + (instance1 == instance2));

        System.out.println("-------------------------------------------------");
        DoubleCheckedLockingSingleton dcInstance1 = DoubleCheckedLockingSingleton.getInstance();
        dcInstance1.showMessage();
        DoubleCheckedLockingSingleton dcInstance2 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println("Are both instances the same? " + (dcInstance1 == dcInstance2));
    }
}
