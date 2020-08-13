package com.test.custom.list;

public class MainListTest {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(10);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		System.out.println(list.print());
		
		System.out.println(list.delete(1));
		
		System.out.println(list.print());
		
		System.out.println(list.delete(6));
		
		System.out.println(list.print());
		
		System.out.println(list.delete(3));

		System.out.println(list.print());
		
		System.out.println(list.delete(15));

		System.out.println(list.print());
		
		System.out.println(list.isDuplicate(4));
		
		System.out.println(list.isDuplicate(40));
		
		System.out.println(list.delete(5));
		
		System.out.println(list.print());
	}

}
