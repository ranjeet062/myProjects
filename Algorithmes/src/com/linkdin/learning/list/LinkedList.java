package com.linkdin.learning.list;

public class LinkedList {

	private Node<Integer> head;
	private int length;	
	
	public void insertAtHead(int data){
		Node newNode = new Node<>(data);
		newNode.setNext(this.head);
		this.head = newNode;
		length++;
	}
	public void deleteAtHead(){
		this.head = this.head.getNext();
		length--;
	}
	
	public Node find(Integer data){
		Node current = this.head;
		while(current != null){
			if(current.getData() == data){
				return current;
			}
			current = current.getNext();
		}
		return null;
	}
	
	public Node<Integer> getHead() {
		return head;
	}
	public void setHead(Node<Integer> head) {
		this.head = head;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}


	@Override
	public String toString() {
		String result ="{";
		Node current = this.head;
		while(current != null){
			result += current.toString() +", ";
			current= current.getNext();
		}
		return result+" }";
	}
	
	
}
