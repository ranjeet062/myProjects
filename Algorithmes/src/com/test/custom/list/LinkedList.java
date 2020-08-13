package com.test.custom.list;

public class LinkedList {

	private Node head;
	private int capacity;
	private int size;

	public LinkedList() {
		this.capacity = 10;
		this.size = 0;
	}

	public LinkedList(int capacity) {
		this.size = 0;
		this.capacity = capacity;
	}

	public Node getHead() {
		return head;
	}

	public int getSize() {
		return this.size;
	}

	public void insert(int data) {
		if ( size < capacity) {
			size++;
			Node n = new Node(data);
			n.setNext(null);
			if (head == null) {
				head = n;
			} else {
				Node next = head;
				while (next.getNext() != null) {
					next = next.getNext();
				}
				next.setNext(n);
			}
		}
	}

	public String print() {
		StringBuffer sb = new StringBuffer();
		if (getSize() > 0) {
			Node next = head;
			while (next != null) {
				sb.append(next.getData()+ ", ");
				next = next.getNext();
			}
		}
		String string = sb.toString();
		return string.substring(0, string.length()-2);
	}
	
	
	public boolean delete(int data)
	{
		Node current = head;
		Node prev = null;
		if(current.getData() == data && current != null)
		{
			head= current.getNext();
			return true;
		}
		while(current != null && current.getData() != data)
		{
			prev= current;
			current = current.getNext();
		}
		if(current != null)
		{
			prev.setNext( current.getNext());
			return true;
		}
		if(current == null)
		{
			return false;
		}
		return false;
	}
	
	public boolean isDuplicate(int data)
	{
		Node current = head;
		while(current != null && current.getData() != data)
		{
			current = current .getNext();
		}
		if(current == null)
		{
			return false;
		}
		return true;
	}
}
