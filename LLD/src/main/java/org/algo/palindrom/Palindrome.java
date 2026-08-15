package org.algo.palindrom;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(s + " is palindrome: " + isPalindrome(s));
    }

    static String isPalindrome(String s) {
        String temp = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = temp.length() - 1;
        while (left < right) {
            if (temp.charAt(left) != temp.charAt(right)) {
                return "No";
            }
            left++;
            right--;
        }
        return "Yes";
    }
}
