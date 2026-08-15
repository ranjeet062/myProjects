package org.algo.isvalidsudoku;

import java.util.HashSet;
import java.util.Set;

public class ContainsInWindow {
    public static void main(String[] args) {
        //int [] nums = {1, 2, 3, 1};
        //int k = 3;
        /*int [] nums = {1, 0, 1, 1};
        int k = 1;*/
        int [] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;

        System.out.println("Contains duplicate in window: " + containsNearbyDuplicate(nums, k));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i-k-1]);
            }
            if (!window.add(nums[i])) {
                return true; // Duplicate found in the current window
            }
        }

        return false;
    }
}
