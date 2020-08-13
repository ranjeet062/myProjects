package com.test.custom.doubly.list;

public class MainDListTest {

	public static void main(String[] args) {

		/*DoublyLinkedList list = new DoublyLinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list.print());
		System.out.println(list.delete(5));
		System.out.println(list.print());
		System.out.println(list.delete(6));
		System.out.println(list.print());
		System.out.println(list.delete(1));
		System.out.println(list.print());*/
		
		String s= new String();
		for(int i=1; i<=1000;i++)
		{
			s= s.concat(Integer.toString(i)+",");
		}
		System.out.println(s);
	}

}
