package org.example;

public class LinkedListNode {

    int val;
    LinkedListNode next;
    LinkedListNode child;
    LinkedListNode() {}
    LinkedListNode(int val) { this.val = val; }
    LinkedListNode(int val, LinkedListNode next, LinkedListNode child) {
        this.val = val;
        this.next = next;
        this.child = child;
    }
}
