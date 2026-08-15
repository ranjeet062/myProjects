package org.algo.isvalidsudoku;

import java.util.Arrays;

public class ImageRotate {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Arrays.stream(matrix).map(row -> Arrays.toString(row))
                .forEach(System.out::println);
        rotate(matrix);
        System.out.println("After rotation:");
        Arrays.stream(matrix).map(row -> Arrays.toString(row))
                .forEach(System.out::println);
    }
    static void rotate(int [][] matrix) {
        int edgeLength = matrix.length;
        int topRow =0;
        int bottomRow = edgeLength -1;
        // vertical swap
        while( topRow < bottomRow) {
            for (int col= 0; col < edgeLength; col++) {
                int temp = matrix[topRow][col];
                matrix[topRow][col] = matrix[bottomRow][col];
                matrix[bottomRow][col] =temp;
            }
            topRow++;
            bottomRow--;
        }
        for (int row = 0 ; row < edgeLength; row++) {
            for (int col = row +1; col < edgeLength; col++) {
                int temp = matrix[col][row];
                matrix[col][row] = matrix[row][col];
                matrix[row][col] = temp;
            }
        }
    }
}
