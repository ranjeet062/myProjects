package org.algo.linkedlist;

public class LRU {

    private int capacity;
    private DoublyList head;
    private DoublyList tail;
    private java.util.Map<Integer, DoublyList> cacheMap;

    public LRU(int capacity) {
       this.capacity = capacity;
         this.cacheMap = new java.util.HashMap<>();
         this.head = new DoublyList(-1, -1);
         this.tail = new DoublyList(-1, -1);
         head.next = tail;
         tail.prev = head;

    }

    public void add(DoublyList node) {
        DoublyList nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;
    }
    public  void remove(DoublyList node) {
        DoublyList prevNode = node.prev;
        DoublyList nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void put (int key, int value) {
        if(cacheMap.containsKey(key)) {
            DoublyList existingNode = cacheMap.get(key);
            remove(existingNode);
        }
        DoublyList newNode = new DoublyList(key, value);
        cacheMap.put(key, newNode);
        add(newNode);
        if(cacheMap.size() > capacity) {
           DoublyList nodeToDelete = tail.prev;
           remove(nodeToDelete);
           cacheMap.remove(nodeToDelete.key);
        }
    }

     public int get(int key) {
         if(!cacheMap.containsKey(key)) {
             return -1;
         }
         DoublyList node = cacheMap.get(key);
         remove(node);
         add(node);
         return node.val;
     }

}
