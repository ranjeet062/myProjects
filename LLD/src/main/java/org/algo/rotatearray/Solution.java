package org.algo.rotatearray;

public class Solution {
    public static void main(String[] args) {

/*        int [] nums = {1,2,3,4,5,6,7};
        // 7,6,5,4,3,2,1
        //5,6,7,4,3,2,1
        // 5,6,7,1,2,3,4
        //right rotation/ clockwise:  5,6,7,1,2,3,4
        // o to n-1, o to k-1, k to n-1
        int k = 3;
        System.out.print("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");

        int length = nums.length;

        rotateRight(nums, k);
        System.out.print("Rotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");

        // 1,2,3,4,5,6,7
        // left rotation/ anticlockwise: 4,5,6,7,1,2,3
        // 3,2,1,4,5,6,7
        // 3,2,1,7,6,5,4
        // 4,5,6,7,1,2,3
        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateLeft(nums, k);
        System.out.print("Rotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");*/

        int [] nums2 = {-1};
        int k1 =2;
        rotateRight(nums2, k1);

    }

    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
//k = k % n;
        reverse(nums,0, k-1);
        System.out.print("Post 0 to k-1. Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
        reverse(nums, k, n-1);
        System.out.print("Post k to n-1. Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
        reverse(nums, 0, n-1);
        System.out.print("Post k to n-1. Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
    public static void rotateRight(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        System.out.print("Post 0 to n-1. Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
        reverse(nums, 0, k-1);
        System.out.print("Post 0 to k-1. Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
        reverse(nums, k, n-1);
        System.out.print("Post k to n-1. Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public static void reverse(int[] nums, int l, int r) {
        while( l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
