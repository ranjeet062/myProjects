package org.algo.longestBalenced;

import java.util.HashMap;

public class LongestBalanced {
    public static void main(String[] args) {
        int [] nums = {3, 2, 2, 5, 4};
        System.out.println(longestBalancedSubstring(nums));
    }

        public static int longestBalancedSubstring(int [] nums) {
            int len = 0;

            for (int i = 0; i < nums.length; i++) {
                HashMap<Integer, Integer> odd = new HashMap<>();
                HashMap<Integer, Integer> even = new HashMap<>();

                for (int j = i; j < nums.length; j++) {
                    HashMap<Integer, Integer> map = (nums[j] & 1) == 1 ? odd : even;
                    map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

                    if (odd.size() == even.size()) {
                        len = Math.max(len, j - i + 1);
                    }
                }
            }

            return len;
        }
}
