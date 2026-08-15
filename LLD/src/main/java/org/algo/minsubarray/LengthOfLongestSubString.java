package org.algo.minsubarray;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }

    static int lengthOfLongestSubstring(String s) {
        boolean [] visited = new boolean[256];
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int n = s.length();
        while (start < n) {
            char currentChar = s.charAt(start);
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                start++;
                maxLength = Math.max(maxLength, start - end);
            } else {
                visited[s.charAt(end)] = false;
                end++;
            }
        }
        return maxLength;
    }
}
