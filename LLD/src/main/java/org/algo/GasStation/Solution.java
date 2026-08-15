package org.algo.GasStation;

public class Solution {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int startIndex = canCompleteCircuit(gas, cost);
        System.out.println("Point to start: " + startIndex);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGasSurplus = 0;
        int GasSurplus = 0;
        int stationCount = gas.length;
        int start = 0;
        for (int i = 0; i < stationCount; i++) {
            totalGasSurplus += gas[i] - cost[i];
            GasSurplus += gas[i] - cost[i];
            if (GasSurplus < 0) {
                start = i + 1;
                GasSurplus = 0;
            }
        }
        return totalGasSurplus >= 0 ? start : -1;
    }

}
