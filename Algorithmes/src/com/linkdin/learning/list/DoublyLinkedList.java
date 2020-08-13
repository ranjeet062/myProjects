package com.linkdin.learning.list;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	
	public void insertTail(int data){
		
		Node newNode = new Node<>(data);
		if(this.head == null){
			this.head=newNode;
		}
		if(this.tail != null){
			this.tail.setNext(newNode);
		}
		this.tail= newNode;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	@Override
	public String toString() {
		String result ="{";
		Node current = this.head;
		while(current != null){
			result += current.toString() +", ";
			current= current.getNext();
		}
		return result+"}";
	}

}
