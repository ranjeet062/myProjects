package org.example;

public class SubsetSum {

    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(nums, nums.length ,sum) ? "Found a subset with given sum" : "No subset with given sum");
    }

    static boolean isSubsetSum(int[] nums, int size, int sum) {
        if (sum == 0) {
            return true;
        }
        if (size == 0) {
            return false;
        }
        if (nums[size - 1] > sum) {
            return isSubsetSum(nums, size - 1, sum);
        }

       return  isSubsetSum(nums, size - 1, sum) || isSubsetSum(nums, size - 1, sum - nums[size - 1]);

    }
}
