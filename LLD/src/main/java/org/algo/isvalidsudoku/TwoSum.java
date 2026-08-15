package org.algo.isvalidsudoku;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("Two Sum Result: [" + result[0] + ", " + result[1] + "]");
    }

    static int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> numToIndex = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
             int num = nums[i];
             int complement = target - num;
             if(numToIndex.containsKey(complement)) {
                 return new int[]{numToIndex.get(complement), i};
             }
                numToIndex.put(num, i);
         }
         return new int[]{-1, -1}; // Return an invalid index if no solution is found

    }
}
