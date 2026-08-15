package org.algo.minsubarray;

public class Solutions {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum subarray length: " + result);
    }

    static int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;

        while (start < n) {
            sum += nums[start];
            start++;
            while (sum >= target) {
                minLength = Math.min(minLength, start - end);
                sum -= nums[end];
                end++;
            }

        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
