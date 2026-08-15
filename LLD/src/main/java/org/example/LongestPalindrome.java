package org.example;

import java.util.Arrays;

public class LongestPalindrome {

    public static void main(String[] args) {

        String [] words = {"aaaabbaa","forgeeksskeegfor","geeks", "abacac"};
        Arrays.stream(words).forEach(word -> System.out.println(longestPalindrome(word)));

    }

    static String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = 0;
        String ans = null;
        for (int i = 0; i < n; i++) {
            String temp = solve(s, i, i);
            if (temp.length() > maxLength) {
                maxLength = temp.length();
                ans = temp;
            }
            temp = solve(s, i, i + 1);
            if (temp.length() > maxLength) {
                maxLength = temp.length();
                ans = temp;
            }

        }
        return ans;
    }
        static String solve(String s, int start, int end){
            while (start >= 0 && end < s.length() ) {
                if (s.charAt(start) == s.charAt(end)) {
                    start--;
                    end++;
                } else {
                    break;
                }
            }
            return s.substring(start + 1, end);
        }

}
