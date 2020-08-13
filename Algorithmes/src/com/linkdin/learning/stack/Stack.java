package com.linkdin.learning.stack;

public class Stack {

	private int capacity;
	private int top;
	private int[] arrayList;
	
	public Stack(int capacity){
		this.capacity = capacity;
		arrayList = new int[capacity];
	}
	
}
