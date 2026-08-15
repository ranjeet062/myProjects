package org.example;

import java.util.PriorityQueue;

public class FlattenLinkedList {
    public static void main(String[] args) {

        LinkedListNode head = new LinkedListNode(5);
        head.child = new LinkedListNode(7);
        head.child.child = new LinkedListNode(8);
        head.child.child.child = new LinkedListNode(30);

        head.next = new LinkedListNode(10);
        head.next.child = new LinkedListNode(20);

        head.next.next = new LinkedListNode(19);
        head.next.next.child = new LinkedListNode(22);
        head.next.next.child.child = new LinkedListNode(50);

        head.next.next.next = new LinkedListNode(28);

        printAll(head);
        head = flatten(head);
        printList(head);

    }

    public static LinkedListNode flatten(LinkedListNode root) {

        PriorityQueue<LinkedListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        LinkedListNode head = null;
        LinkedListNode tail = null;
        while (root != null) {
            minHeap.offer(root);
            root = root.next;
        }

        while (!minHeap.isEmpty()) {
            LinkedListNode curr = minHeap.poll();
            if (head == null) {
                head = curr;
                tail = curr;
            } else {
                tail.child = curr;
                tail = tail.child;
            }
            if (curr.child != null) {
                minHeap.offer(curr.child);
                curr.child = null;
            }
        }
        return head;
    }

    public static void printAll(LinkedListNode head) {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            LinkedListNode childTemp = temp.child;
            while (childTemp != null) {
                System.out.print("-> " + childTemp.val + " ");
                childTemp = childTemp.child;
            }
            System.out.println();
            temp = temp.next;
        }
    }
    public static void printList(LinkedListNode head) {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if(temp.child!=null)
            {
                System.out.print(" -> ");
            }
            temp = temp.child;
        }
        System.out.println();
        }
}

