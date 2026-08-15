package org.algo.roman;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println("The integer value of " + s + " is: " + result);
    }

    public static int romanToInt(String s) {
        int total = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                total -= roman.get(s.charAt(i));
            } else {
                total += roman.get(s.charAt(i));
            }
        }
        return total + roman.get(s.charAt(s.length() - 1));
    }

}
