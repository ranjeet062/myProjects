package org.algo.removeelements;

public class RemoveDuplicateFromShortedArray {
    public static void main(String[] args) {

        // Input: nums = [0,0,1,1,1,2,2,3,3,4]
        // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

        System.out.println("------------------------------");

       // Input: nums = [1,1,1,2,2,3]
       // Output: 5, nums = [1,1,2,2,3,_]

        System.out.println(removeFewFromDuplicates(new int[]{1,1,1,2,2,3}));

        // Input: nums = [0,0,1,1,1,1,2,3,3]
        // Output: 7, nums = [0,0,1,1,2,3,3,_,_]
        System.out.println(removeFewFromDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));


    }
    static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int k = 1; // Pointer for the position of the next unique element

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Move the unique element to the position k
                k++;
            }
        }

        System.out.print("Modified array with unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return k; // The length of the array with unique elements
    }

    static int removeFewFromDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int k = 2; // Pointer for the position of the next unique element
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i]; // Move the unique element to the position k
                k++;
            }
        }

        return k; // The length of the array with at most two occurrences
    }
}
