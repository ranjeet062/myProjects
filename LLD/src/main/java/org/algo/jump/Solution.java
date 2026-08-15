package org.algo.jump;

public class Solution {
    public static void main(String[] args) {

        int [] nums = {2,3,1,1,4};
       // int jumps = jump(nums);
        // System.out.println("Minimum jumps to reach the end: " + jumps);

        int [] nums2 = {2,1};
     //   int jumps2 = jump2(nums2);
     //   System.out.println("Minimum jumps to reach the end: " + jumps2);

        int [] nums3 = {2,3,1,1,4};
        int jumps3 = jump3(nums3);
        System.out.println("Minimum jumps to reach the end: " + jumps3);
    }

    public static int jump3(int[] nums) {
        int jumps = 0, stair = 0, ladder = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            ladder = Math.max(ladder, i + nums[i]);
            if (i == stair) {
                jumps++;
                stair = ladder;

                if (stair >= nums.length - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
    public static int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int ladder = nums[0];
        int stair = nums[0];
        int jump = 0;
        for (int i= 0; i < nums.length; i++) {
            if(i == nums.length) {
                return jump;
            }
            if(nums[i] > ladder) {
                ladder = nums[i];
            }
            stair--;
            if (stair == 0) {
                jump++;
                stair = ladder;
            }
        }
        return jump;
    }
    public static int jump2(int [] nums) {
        if(nums.length <= 1) return 0;
        int jumps = 0;
        int ladder = nums[0];
        int stair = nums[0];
        for (int level = 1; level <= nums.length; level++) {
            if(level == nums.length) {
                if(stair != 0) {
                    jumps++;
                }
                return jumps;
            }
            if(level + nums[level] > ladder) {
                ladder = level + nums[level];
            }

            stair--;
            if(stair == 0) {
                jumps++;
                stair = ladder - level;
            }
        }


        return jumps;
    }
}
