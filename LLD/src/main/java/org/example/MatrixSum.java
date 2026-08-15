package org.example;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, -1},
                {-1, 1}
        };

      System.out.println(sumMatrix(matrix));
    }

    public static long sumMatrix(int[][] matrix) {
        long totalSum = 0;
        int countNegative = 0;
        int countZero = 0;
        int minAbsValue = Integer.MAX_VALUE;
        for (int [] row : matrix) {
            for (int value : row) {
                totalSum += Math.abs(value);
                if (value < 0) {
                    countNegative++;
                } else if (value == 0) {
                    countZero++;
                }
                minAbsValue = Math.min(minAbsValue, Math.abs(value));

            }
        }
        if (countZero > 0 || countNegative % 2 == 0) {
            return totalSum;
        } else {
            return totalSum-=  2 * minAbsValue;
        }
    }
}
