package org.algo.countofpositiveandnegative;

public class Solution {

    public static void main(String[] args) {
        int [] nums = {-2,0,1,-3};
       /* int [] result = countPosNeg(nums);
        System.out.println("Positive count: " + result[0]);
        System.out.println("Negative count: " + result[1]);*/

            nums = new int[]{-3,-2,-1,0,0,1,2};
            int [] result = countPosNegFromShortedArray(nums);
        System.out.println("Positive count: " + result[0]);
        System.out.println("Negative count: " + result[1]);
    }

    public static int[] countPosNeg(int [] nums) {
        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : nums) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

       // Math.max(positiveCount, negativeCount);
        return new int[]{positiveCount, negativeCount};
    }

    public static int[] countPosNegFromShortedArray(int [] nums) {
        int positiveCount = 0;
        int negativeCount = 0;

        // find the count of positive numbers using binary search
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        positiveCount = nums.length - left; // Count of positive numbers

        // find the count of negative numbers using binary search
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        negativeCount = right + 1; // Count of negative numbers


        return new int[]{positiveCount, negativeCount};
    }
}
