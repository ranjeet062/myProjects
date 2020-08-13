package com.linkdin.learning.list;

public class LinkedListDemo {

	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(15);
		list.insertAtHead(20);
		System.out.println("head"+list.getHead());
		System.out.println(list);
		System.out.println(list.getLength());
		
		list.deleteAtHead();
		System.out.println("head"+list.getHead());
		System.out.println(list);
		System.out.println(list.getLength());
		
		System.out.println(list.find(15));
		
		System.out.println(list.find(25));
	}
}
