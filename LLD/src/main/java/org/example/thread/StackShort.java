package org.example.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackShort {
    public static void main(String[] args) {
/*
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
*/

        List<Integer> list = List.of(1,3,2,4,5, 6);
        list = list.stream().sorted().toList();
        for (int i =1 ; i < list.size(); i++) {
            if(list.get(i) - list.get(i-1) == 0) {
                System.out.println("repeated element: " + list.get(i));
            }
            if(list.get(i) - list.get(i-1) > 1) {
                System.out.println("missing element: " + (list.get(i-1) + 1));
            }
        }

//        StackShort stackShort = new StackShort();
//
//        stackShort.sortStack(stack);
//        while(! stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//        stack.stream().sorted().forEach(System.out::println);

    }
    void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            sortedInsert(stack, temp);
        }
    }
    void sortedInsert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
        int temp = stack.pop();
        sortedInsert(stack, element);
        stack.push(temp);
    }


}
