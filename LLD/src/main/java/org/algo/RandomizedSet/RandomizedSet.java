package org.algo.RandomizedSet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> list;

    public RandomizedSet() {
        // Initialize the map and list
        map = new HashMap<>();
        list = new java.util.ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // Value already exists
        }
        map.put(val, list.size()); // Store the index of the value in the list
        list.add(val); // Add the value to the list
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // Value does not exist
        }
        int index = map.get(val); // Get the index of the value to remove
        int lastElement = list.get(list.size() - 1); // Get the last element in the list

        // Move the last element to the index of the element to remove
        list.set(index, lastElement);
        map.put(lastElement, index); // Update the index of the last element in the map

        // Remove the last element from the list and map
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = (int) (Math.random() * list.size()); // Generate a random index
        return list.get(randomIndex); // Return the value at the random index
    }

}
