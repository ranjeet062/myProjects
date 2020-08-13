package com.linkdin.learning.list;

public class DoublyLinkedList2 {

	private DoublyLinkedNode head;
	
	
	public DoublyLinkedNode getHead() {
		return head;
	}

	public void setHead(DoublyLinkedNode head) {
		this.head = head;
	}

	public void insertAtHead(int data){
		
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNext(this.head);
		if(this.head != null){
			this.head.setPrev(newNode);
		}
		this.head= newNode;		
	}
	
	@Override
	public String toString() {
		String result ="{";
		DoublyLinkedNode current = this.head;
		while(current != null){
			result += current.toString() +", ";
			current= current.getNext();
		}
		return result+"}";
	}
	
}
