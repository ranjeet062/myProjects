package org.algo.productexceptself;

public class Solution2 {
    public static void main(String[] args) {
     Solution2 s = new Solution2();
        int[] nums = {1, 2, 3, 4};
        int[] result = s.productExceptSelf(nums);
        System.out.print("Product except self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];
        int prefix = 1;
        for(int i=0; i< n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int sufix = 1;
        for(int i= n-1; i >=0; i--) {
            result[i] *= sufix;
            sufix *= nums[i];
        }
        return result;
    }
}
