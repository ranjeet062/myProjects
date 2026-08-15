package org.algo.isvalidsudoku;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("groupAnagrams: " + groupAnagrams(strs));
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> anagramGroups = new HashMap<>();

        for (String s : strs) {
            char [] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(!anagramGroups.containsKey(sortedString)) {
                anagramGroups.put(sortedString, new ArrayList<>());
            }
            anagramGroups.get(sortedString).add(s);
         }
        return new ArrayList<>(anagramGroups.values());
    }

}

