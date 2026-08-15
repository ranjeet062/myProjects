package org.algo.isvalidsudoku;

public class SimplifyPath {
    public static void main(String[] args) {

            String path = "/a/./b/../../c/";
            System.out.println("simplifyPath: " + simplifyPath(path));
    }

    static String simplifyPath(String path) {
        String[] parts = path.split("/");
        java.util.Stack<String> stack = new java.util.Stack<>();
        int a = 1;
        String.valueOf(a);

        StringBuffer sb = new StringBuffer();
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        } else {
            while (!stack.isEmpty()) {
                String part = stack.pop();
                sb.insert(0,part).insert(0,"/");
            }
        }
        return sb.toString();
    }
}
