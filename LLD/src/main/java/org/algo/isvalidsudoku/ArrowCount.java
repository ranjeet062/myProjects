package org.algo.isvalidsudoku;

import java.util.Arrays;

public class ArrowCount {
    public static void main(String[] args) {
        //int[][] n = {{10,16}, {2,8}, {1,6}, {7,12}};
        // int[][] n = {{1,2}, {3,4}, {5,6}, {7,8}};
        int[][] n = {{1,2}, {2,3}, {3,4}, {4,5}};
        int count = countArrows(n);
        System.out.println("Number of arrows: " + count);
    }

    static int countArrows(int[][] segments) {
        Arrays.sort(segments, (a, b) -> Integer.compare(a[1], b[1]));
        // {{1,6}, {2,8}, {7,12}, {10,16}}
        int ans = 0, arrow = 0;
        for (int i = 0; i < segments.length; i++) {
            if (ans == 0 || segments[i][0] > arrow) {
                ans++; // 1, 2
                arrow = segments[i][1]; // 2, 4
            }
        }
        return ans;
    }


}
