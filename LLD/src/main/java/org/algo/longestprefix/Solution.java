package org.algo.longestprefix;

public class Solution {
    public static void main(String[] args) {
        String s1 = "flower";
        String s2 = "flow";
        String s3 = "flight";

        String longestPrefix = longestCommonPrefix(new String[]{s1, s2, s3});
        System.out.println("Longest common prefix: " + longestPrefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int prefixLength = prefix.length();
        for (int i = 1; i < strs.length; i++) {
            String currentString = strs[i];
            while (prefixLength > currentString.length() || !currentString.substring(0, prefixLength).equals(prefix)) {
                prefixLength--;
                if (prefixLength == 0) {
                    return "";
                }
                prefix = prefix.substring(0, prefixLength);
            }
        }
        return prefix;
    }
}
