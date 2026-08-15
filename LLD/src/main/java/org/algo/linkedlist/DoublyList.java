package org.algo.linkedlist;

public class DoublyList {
    int val;

    int key;
    DoublyList next;
    DoublyList prev;
    DoublyList() {
    }
    DoublyList(int key, int val) {
        this.val = val;
        this.key = key;
    }
    DoublyList(int key, int val, DoublyList next, DoublyList prev) {
        this.key = key;
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
