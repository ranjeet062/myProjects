package com.test.tree;

public class Node<E> {

	
	private Node left;
	private Node right;
	private E data;
	
	public Node()
	{
	}
	
	public Node(E data)
	{
		this.data=data;
		left = null;
		right = null;
	}
	
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	
	
}
