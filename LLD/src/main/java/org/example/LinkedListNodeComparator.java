package org.example;

public class LinkedListNodeComparator implements java.util.Comparator<LinkedListNode> {
    @Override
    public int compare(LinkedListNode node1, LinkedListNode node2) {
        return Integer.compare(node1.val, node2.val);
    }
}