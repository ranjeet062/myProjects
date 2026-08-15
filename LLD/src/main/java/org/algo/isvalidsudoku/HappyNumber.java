package org.algo.isvalidsudoku;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            n = isHappy(n);
            if (n == 1) {
                System.out.println("Is Happy Number: true");
                return;
            }
        }
        System.out.println("Is Happy Number: false");
    }

    static int isHappy(int n) {
        int sum= 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
