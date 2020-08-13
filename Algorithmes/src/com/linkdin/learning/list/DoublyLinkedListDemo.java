package com.linkdin.learning.list;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertTail(5);
		list.insertTail(15);
		list.insertTail(25);
		list.insertTail(35);
		System.out.println(list);
		System.out.println(list.getHead());
		System.out.println(list.getTail());

	}

}
