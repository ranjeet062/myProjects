package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

/*
     int [] a = new int[]{2,4,7};

            int indexOfMinimum = -1;
            int minimalSum = Integer.MAX_VALUE;

            for (int i = 0; i < a.length; i++) {
                int sum = 0;
                for (int j = 0; j < a.length; j++) {

                    sum += Math.abs(a[j] - a[i]);

                }
                if (sum < minimalSum) {
                    minimalSum = sum;
                    indexOfMinimum = i;
                }
*/
        //    }

        //   System.out.print(a[indexOfMinimum]);

            int[] nums = {1, 2, 3};
            ArrayList<ArrayList<Integer>> subsets = subsets(nums);
            System.out.println(subsets);
        }

        static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            for (int num : nums) {
                int size = result.size();
                for(int i = 0; i < size; i++) {
                    ArrayList<Integer> subset = new ArrayList<>(result.get(i));
                    subset.add(num);
                    result.add(subset);
                }
            }
            return result;
        }

}

