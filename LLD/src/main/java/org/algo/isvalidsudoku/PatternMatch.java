package org.algo.isvalidsudoku;

import java.util.HashMap;
import java.util.Map;

public class PatternMatch {
    public static void main(String[] args) {
        String pattern = "abba";
        String p = "dog dog dog dog";
        System.out.println("isMatch: " + isMatch(pattern, p));
    }

    static boolean isMatch(String pattern, String s) {
        String [] words = s.split(" ");
        if(pattern.length() != words.length) {
            return false;
        }
        Map<Character, String > wordToChar = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if(!wordToChar.containsKey(c)) {
                if (wordToChar.containsValue(word))
                    return false;
                wordToChar.put(c, word);
            }
            else {
                if (!wordToChar.get(c).equals(word))
                    return false;
            }
        }
        return true;
    }
}
