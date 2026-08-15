package org.example;

public class MaxThreeDigitNumber {

    public static void main(String[] args) {
        char maxDigit = '0';
        String s = "222";
        for (int i = 0; i <= s.length()-3; i++) {
           if(s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)) {
               maxDigit = (char) Math.max(maxDigit, s.charAt(i));
           }
        }
        System.out.println(new String(new char[] {maxDigit, maxDigit, maxDigit}));
    }


}
