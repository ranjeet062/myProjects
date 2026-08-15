package org.algo.isvalidsudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {2,5};
        int[][] res = insert(intervals, newInterval);
        Arrays.stream(res).forEach(interval -> System.out.println("[" + interval[0] + ", " + interval[1] + "]"));
    }

    static int[][] insert(int[][] intervals, int[] newInterval) {
        java.util.List<int[]> result = new java.util.ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                result.add(interval);
            } else if (interval[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = interval;
            } else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}
