package org.algo.productexceptself;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.print("Product except self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int [] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = 1;
            for (int j = 0; j < n; j++) {
                if( i == j) {
                    continue;
                }
                result[i] *= nums[j];
            }
        }
        return result;
    }
}
