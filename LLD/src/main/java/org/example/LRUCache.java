package org.example;

import java.util.Map;

public class LRUCache {
    static int capacity;
    static Node head;
    static Node tail;
    static Map<Integer, Node> cacheMap;

    static class Node {
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new java.util.HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public static void add(Node node) {
     Node nextNode = head.next;
     head.next = node;
     node.prev = head;
     node.next = nextNode;
     nextNode.prev = node;
    }

    public static void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    static void put (int key, int value) {
        if(cacheMap.containsKey(key)) {
            Node existingNode = cacheMap.get(key);
            remove(existingNode);
        }
        Node newNode = new Node(key, value);
        cacheMap.put(key, newNode);
        add(newNode);
        if(cacheMap.size() > capacity) {
           Node nodeToDelete = tail.prev;
           remove(nodeToDelete);
           cacheMap.remove(nodeToDelete.key);
        }
    }

    static int get(int key) {
        if (!cacheMap.containsKey(key)) {
            return -1;
        }
        Node node = cacheMap.get(key);
        remove(node);
        add(node);
        return node.val;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2
        System.out.println(lruCache.cacheMap.entrySet());
        System.out.println(lruCache.get(1));    // return 1
        System.out.println(lruCache.cacheMap.entrySet());
        System.out.println(lruCache.get(2));    // return 2
        System.out.println(lruCache.cacheMap.entrySet());
        lruCache.put(3, 3); // evicts key 1, cache is {2=2, 3=3
        System.out.println(lruCache.cacheMap.entrySet());
        System.out.println(lruCache.get(1));    // return -1 (not found)
        lruCache.put(4, 4); // evicts key 2, cache is {3=3, 4=4
        System.out.println(lruCache.cacheMap.entrySet());
        System.out.println(lruCache.get(1));    // return -1 (not found)
        System.out.println(lruCache.get(3));    // return 3
        System.out.println(lruCache.cacheMap.entrySet());
        lruCache.put(5, 5); // evicts key 4, cache is {5=5, 3=3
        System.out.println(lruCache.cacheMap.entrySet());
    }
}
