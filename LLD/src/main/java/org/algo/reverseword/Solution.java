package org.algo.reverseword;

public class Solution {
    public static void main(String[] args) {
        String s = "Hello World";
        String reversed = reverseWords(s);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        int i = 0, j = words.length - 1;
        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        return String.join(" ", words);
    }
}
