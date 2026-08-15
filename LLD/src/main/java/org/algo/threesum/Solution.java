package org.algo.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums).forEach(list -> System.out.println(list));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i =0; i< n; i++)  {

            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = n-1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
            return result;
    }
}
