package org.algo.palindrom;

public class SumOfTwoInArray {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        SumOfTwoInArray solution = new SumOfTwoInArray();
        int[] result = solution.twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[] {l+1, r+1};
            }
            else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[] {-1, -1};
    }
}
