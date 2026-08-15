package org.example;

public class ReorderedPowerOfTwo {

    public static void main(String[] args) {
        int n = 812;
        System.out.print(reorderedPowerOf2(n));
    }

    private static boolean reorderedPowerOf2(int n) {
        String sortedN = sortedString(n);
        for (int i = 0; i < 31; i++) {
             String s = sortedString(1 << i);
            if (sortedN.equals(s)) {
                return true;
            }
        }
        return false;
    }
    private static String sortedString(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}

