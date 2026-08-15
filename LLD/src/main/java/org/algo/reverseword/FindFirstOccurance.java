package org.algo.reverseword;

public class FindFirstOccurance {
    public static void main(String[] args) {

        String haystack = "abc";
        String needle = "c";
        FindFirstOccurance solution = new FindFirstOccurance();
        int index = solution.strStr(haystack, needle);
        System.out.println("First occurrence index: " + index);
    }

    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) {
            return -1;
        }
        int k = needle.length();
        for (int i =0; i <= haystack.length(); i++) {
            if(needle.equals(haystack.substring(i, i+k))) {
                return i;
            }
        }
        return -1;
    }
}
