package org.algo.majorityelement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        //System.out.println(majorityElement(nums));

        //System.out.println(majorityElement2(nums));

            maxFrequency(nums);
    }

    public static void maxFrequency(int [] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int majorityElement = nums[0];

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > maxCount) {
                maxCount = countMap.get(num);
                majorityElement = num;
            }
        }

        System.out.println("Majority Element: " + majorityElement + " with count: " + maxCount);
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static int majorityElement2(int [] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if(countMap.get(num) > majorityCount) {
                return num;
            }
        }
        return -1;
    }
}
