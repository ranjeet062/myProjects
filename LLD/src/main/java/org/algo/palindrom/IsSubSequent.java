package org.algo.palindrom;

public class IsSubSequent {
    public static void main(String[] args) {
        String s = "ace";
        String t = "abcde";
        System.out.println(s + " is subsequence of " + t + ": " + isSubsequence(s, t));
    }

    static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
