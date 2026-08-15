package org.algo.substringwithconcatenation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}).stream().forEach(s -> System.out.println(s));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new java.util.ArrayList<>();
        if (s.length() == 0 || words.length == 0) {
            return result;
        }
        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = s.length();
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        for (int offset = 0; offset < wordLength; offset++) {
            Map<String, Integer> currentFrequency = new HashMap<>();
            int start = offset;
            int count = 0;
            for (int end = offset; end + wordLength <= totalLength; end += wordLength) {
                String currentWord = s.substring(end, end + wordLength);
                if (wordFrequency.containsKey(currentWord)) {
                    currentFrequency.put(currentWord, currentFrequency.getOrDefault(currentWord, 0) + 1);
                    count++;
                    while (currentFrequency.get(currentWord) > wordFrequency.get(currentWord)) {
                        String leftmostWord = s.substring(start, start + wordLength);
                        currentFrequency.put(leftmostWord, currentFrequency.get(leftmostWord) - 1);
                        count--;
                        start += wordLength;
                    }
                    if(count == wordCount) {
                        result.add(start);
                    }

                } else {
                    count = 0;
                    start = end + wordLength;
                    currentFrequency.clear();
                }

            }
        }
        return result;
    }
}
