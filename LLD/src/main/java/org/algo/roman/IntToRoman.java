package org.algo.roman;

public class IntToRoman {

    public static void main(String[] args) {

        int num = 1994;
        String romanNumeral = intToRoman(num); // 1000+900+90+4 = MCMXCIV
        System.out.println("Integer: " + num + " -> Roman Numeral: " + romanNumeral);
    }

    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i< values.length; i++) {
            if (num == 0) {
                break;
            }
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }

        return sb.toString();
    }
}
