package org.algo.removeelements;

public class Solution {

    public static void main(String[] args) {

       // Input: nums = [3,2,2,3], val = 3
       //  Output: 2, nums = [2,2,_,_]

        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);
        System.out.println("k: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
System.out.println("------------------");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k=0;
        for(int i=0; i<n;i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
