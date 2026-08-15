package org.algo.vowelcheck;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VowelCheck {
    public static void main(String[] args) {

        String [] wordList = {"dtk","oag","pad","nfs","xej","bys","dgp","hev","hsk","gws","kqd","ztv","fvi","irw","rhv","dys","ofl","lnt","vmq","vsp","kbv","fof","ako","gbu","mbd","szy","zlr","cpt","xck","hdg","uoo","fvm","vla","fpe","mpk","abv","mcf","ibp","num","ouv","icx","uab","wka","ozz","gte","vpv","rvd","hed","fcl","iaf","sba","wxa","gjp","qzh","kjv","fxr","msf","bwj","wqp","whj","vxu","xoe","wwh","ray","jor","vsi","yft","ngn","inf","ggw","kwj","irk","vqs","zvi","lwx","ooc","fdi","ana","jcg","rga","vow","gia","nxa","pgr","ymw","kfk","rur","bud","cfe","ffn","wnr","uzh","yff","ucx","xss","mbi","tph","efn","syu","sqz"};
        String [] queryList = {"nrm","szv","inf","ngn","Ouv","mqk","bra","pie","xyz","mif","hjz","hlr","ltt","zce","dtK","lyw","zvi","yha","bMi","eyy","xoc","MCF","vOW","tvv","wpv","jcg","kqd","hvi","wmz","nmf","aiF","fvm","puk","vxi","ztv","NxA","rwo","kFK","vxu","esi","vla","uub","fom","gJp","ahb","bJW","ipv","syU","nyg","xss","iom","qnp","soy","smv","zzo","Bys","lnt","wuc","uqk","syu","aok","efn","dju","ooe","ipu","VSi","bod","hdg","wux","vex","qee","ueq","rhv","czm","yff","npo","wka","vmm","jtk","gto","rjx","gjp","nza","idj","xuf","yzp","nhc","kjv","hdG","xOE","whj","eox","lcv","Mbd","bud","vxe","dgp","smo","qdv","bav"};
        String [] result = solution(wordList, queryList);
        for (String res : result) {
            System.out.print(res + ", ");
        }
    }
    public static boolean isVowel(char c) {
        return  (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static String[] solution(String[] wordlist, String [] queries) {
        Set<String> matchSet = new HashSet<>();
        Map<String, String> lowerCaseMatchMap = new HashMap<>();
        Map<String, String> vowelSkipMatchMap = new HashMap<>();

            for (String word : wordlist) {
                // Exact match
                matchSet.add(word);
                // Case-insensitive match
                String lowerCaseWord = word.toLowerCase();
                lowerCaseMatchMap.putIfAbsent(lowerCaseWord, word);
                // Vowel-skip match
                String vowelSkipWord = lowerCaseWord.replaceAll("[aeiouAEIOU]", "*");
                vowelSkipMatchMap.putIfAbsent(vowelSkipWord, word);
            }
            String [] result = new String[queries.length];
            int index = 0;
            for (String query : queries) {
                result[index++] = getIndex(query, vowelSkipMatchMap, result, index, matchSet, lowerCaseMatchMap);
            }

            return result;
     }

    private static String getIndex(String query, Map<String, String> vowelSkipMatchMap, String[] result, int index, Set<String> matchSet, Map<String, String> lowerCaseMatchMap) {
        if (matchSet.contains(query)) {
            return query;
        }

        if (lowerCaseMatchMap.containsKey(query.toLowerCase())) {
            return lowerCaseMatchMap.get(query.toLowerCase());
        }
        String vowelSkipQuery = query.replaceAll("[aeiouAEIOU]", "*");
        if (vowelSkipMatchMap.containsKey(vowelSkipQuery)) {
            return vowelSkipMatchMap.get(vowelSkipQuery);
        }

        return " ";
 }
}
