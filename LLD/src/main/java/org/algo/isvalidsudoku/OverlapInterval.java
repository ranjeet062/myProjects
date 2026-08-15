package org.algo.isvalidsudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlapInterval {

    public static void main(String[] args) {
        int [][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] result = extracted(intervals);
       Arrays.stream(result).forEach(interval -> System.out.println("[" + interval[0] + ", " + interval[1] + "]"));
    }

    private static int[][] extracted(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int [] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (prev[1] >= current[0]) {
                prev[1] = Math.max(prev[1], current[1]);
            } else {
                merged.add(prev);
                prev = current;
            }
        }
        merged.add(prev); // Add the last interval
        return merged.toArray(new int[merged.size()][]);
    }
}
