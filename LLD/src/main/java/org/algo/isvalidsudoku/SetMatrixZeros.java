package org.algo.isvalidsudoku;

import java.util.HashMap;
import java.util.Map;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0}
        };
        setZeroes(matrix);
    }
    
    static void setZeroes(int [][] matrix) {

        boolean zeroInFirstColumn= false;
        for (int row = 0; row < matrix.length; row++) {
            if(matrix[row][0] == 0) {
                zeroInFirstColumn = true;
            }
            for (int col = 1; col < matrix[0].length; col++) {
                if(matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
        for (int row =matrix.length-1; row >= 0; row--) {
            for (int col = matrix[0].length - 1; col >= 1; col--) {

                if(matrix[row][0] == 0 || matrix[0][col] ==0) {
                    matrix[row][col] = 0;
                }
            }
            if (zeroInFirstColumn) {
                matrix[row][0] = 0;
            }
        }
System.out.println("After setting zeroes:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
