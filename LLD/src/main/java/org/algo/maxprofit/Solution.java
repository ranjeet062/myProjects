package org.algo.maxprofit;

public class Solution {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.println("Max profit: " + maxProfit);
    }
    public static int maxProfit(int[] price) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int p : price) {
            if (p < minPrice) {
                minPrice = p; // Update the minimum price
            } else if (p - minPrice > maxProfit) {
                maxProfit = p - minPrice; // Update the maximum profit
            }
        }

        return maxProfit;
    }
}
