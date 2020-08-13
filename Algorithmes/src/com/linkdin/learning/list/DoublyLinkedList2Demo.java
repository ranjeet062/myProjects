package com.linkdin.learning.list;

public class DoublyLinkedList2Demo {

	public static void main(String[] args) {

		DoublyLinkedList2 list = new DoublyLinkedList2();
		list.insertAtHead(5);
		list.insertAtHead(15);
		list.insertAtHead(25);
		list.insertAtHead(35);
		
		System.out.println(list);
		System.out.println(list.getHead());
	}

}
