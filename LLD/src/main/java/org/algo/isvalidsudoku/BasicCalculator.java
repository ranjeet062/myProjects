package org.algo.isvalidsudoku;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        String s = "2-1+2";
        System.out.println("calculate: " + calculate(s));
    }

    static int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num = 0, res = 0, sign = 1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                res += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                res += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
            } else if (c == ')') {
                res += sign * num;
                num = 0;
                int prevSign = st.pop();
                int prevRes = st.pop();
                res = prevRes + prevSign * res;
            }
        }
        if (num != 0) res += sign * num;
        return res;
    }
}
