package org.algo.RandomizedSet;

public class Test {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();

        System.out.println(randomizedSet.insert(1)); // true
        System.out.println(randomizedSet.insert(2)); // true
        System.out.println(randomizedSet.insert(1)); // false

        System.out.println(randomizedSet.remove(2)); // true
        System.out.println(randomizedSet.remove(3)); // false

        System.out.println(randomizedSet.getRandom()); // Should return 1
    }
}
