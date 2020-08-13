package com.test.custom.doubly.list;

public class Node {

	private Node prev;
	private Node next;
	private int data;
	
	public Node()
	{
	}
	public Node(int data)
	{
		this.data=data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
