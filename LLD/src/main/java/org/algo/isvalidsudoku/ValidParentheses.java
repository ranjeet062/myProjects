package org.algo.isvalidsudoku;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "((";
        System.out.println("Is valid parentheses: " + isValid(s));
    }
    static boolean isValid(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        if(s.length() <= 1){
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(!stack.isEmpty()) {

                    char c1 = stack.pop();
                    if ((c == ')' && c1 != '(') || (c == '}' && c1 != '{') || (c == ']' && c1 != '[')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

}
