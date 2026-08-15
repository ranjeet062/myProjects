package org.example;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
     //   System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring2(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        boolean[] seen = new boolean[128];
        int left = 0;
        int right = 0;
        while (right < n) {
            char curr = s.charAt(right);
            if(!seen[curr]) {
                seen[curr] = true;
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                seen[s.charAt(left)] = false;
                left++;
           }
         }
        return maxLength;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            char curr = s.charAt(right);
            while (charSet.contains(curr)) {
               charSet.remove(s.charAt(left));
               left++;
            }
            charSet.add(curr);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
