package org.algo.zigzagstring;

public class Solution {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = convert(s, numRows);
        System.out.println("Zigzag conversion: " + result);
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j= i; j < s.length(); j += 2* (numRows - 1)) {
                sb.append(s.charAt(j));
                if(i > 0 && i < numRows -1 && j + (2 * (numRows - 1)) - (2 * i) < s.length()) {
                    sb.append(s.charAt(j + (2 * (numRows - 1)) - (2 * i)));
                }
            }
        }

        return sb.toString();
    }

     //if (i > 0 && i < numRows - 1 && j + (2 * (numRows - 1)) - (2 * i) < s.length()) {
      //  a.append(s.charAt(j + (2 * (numRows - 1)) - (2 * i)));

}
