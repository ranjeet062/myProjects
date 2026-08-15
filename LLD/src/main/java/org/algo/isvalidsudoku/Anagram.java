package org.algo.isvalidsudoku;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("isAnagram: " + isAnagram(s, t));
        System.out.println("isAnagramUsingSorting: " + isAnagramUsingSorting(s, t));
        System.out.println("isAnagramUsingHashMap: " + isAnagramUsingHashMap(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramUsingSorting(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        java.util.Arrays.sort(sArray);
        java.util.Arrays.sort(tArray);
        return java.util.Arrays.equals(sArray, tArray);
    }

    public static boolean isAnagramUsingHashMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        java.util.Map<Character, Integer> charCount = new java.util.HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            charCount.put(c1, charCount.getOrDefault(c1, 0) + 1);
            charCount.put(c2, charCount.getOrDefault(c2, 0) - 1);
        }
        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}