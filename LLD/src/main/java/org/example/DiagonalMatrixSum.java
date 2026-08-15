package org.example;

public class DiagonalMatrixSum {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix1 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };


        matrixSum(matrix);
        matrixSum(matrix1);
    }

    private static void matrixSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for(int i= 0; i< n; i++) {
            sum += matrix[i][i];
            sum+= matrix[n-1-i][i];
        }
        if(n % 2 == 1) {
            sum-= matrix[n/2][n/2];
        }

        System.out.println(sum);
    }
}
