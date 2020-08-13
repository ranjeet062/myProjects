package com.test.custom.doubly.list;

public class DoublyLinkedList {

	private Node head;
	private Node tail;

	private int size = 0;

	private int capacity;

	public DoublyLinkedList() {
		this.capacity = 10;
	}

	public DoublyLinkedList(int capacity) {
		this.capacity = capacity;
	}

	public void add(int data) {
		if (this.capacity < size) {
			Node n = new Node(data);
			if (head == null) {
				head = tail = n;
				size++;
			} else {
				Node next = head;
				Node prev = null;
				while (next.getNext() != null) {
					prev = next;
					next = next.getNext();
				}
				tail = n;
				n.setPrev(next);
				next.setNext(n);
				size++;
			}
		}
	}

	public String print() {
		StringBuffer sb = new StringBuffer();
		if (size > 0) {
			Node next = head;
			while (next != null) {
				sb.append(next.getData() + ", ");
				next = next.getNext();
			}
		}
		String string = sb.toString();
		return string.substring(0, string.length() - 2);
	}

	public boolean delete(int data) {
		Node temp = head;
		Node prev = null;
		if (head != null && head.getData() == data) {
			head = head.getNext();
			head.setPrev(null);
			size--;
			return true;

		}
		if (tail != null && tail.getData() == data) {
			tail = tail.getPrev();
			tail.setNext(null);
			size--;
			return true;

		}
		while (temp != null && temp.getData() != data) {
			prev = temp;
			temp = temp.getNext();
		}
		if (temp == null) {
			return false;
		} else {
			Node temp2 = temp.getNext();
			prev.setNext(temp2);
			temp2.setPrev(prev);
			temp = null;
			size--;
			return true;
		}

	}
}
