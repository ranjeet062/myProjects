package org.algo.isvalidsudoku;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + longestConsecutive(nums));
    }

    static int longestConsecutive(int[] nums) {
        int longestStreak = 0;
            if (nums == null || nums.length == 0) {
                return 0;
            }
            Set<Integer> numSet = new HashSet<>();
            for (int num : nums) {
                numSet.add(num);
            }
            for (int num : numSet) {
                if (!numSet.contains(num - 1)) { // Start of a sequence
                    int currentNum = num;
                    int currentStreak = 1;

                    while (numSet.contains(currentNum + 1)) {
                        currentNum++;
                        currentStreak++;
                    }

                    longestStreak = Math.max(longestStreak, currentStreak);
                }
            }
            return longestStreak;
    }
}
