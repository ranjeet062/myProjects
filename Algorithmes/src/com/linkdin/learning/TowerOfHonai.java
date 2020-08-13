package com.linkdin.learning;

public class TowerOfHonai {

	public void move(int noOfDiscs, char from, char to, char inter){
		if(noOfDiscs == 0)
			return;
		move(noOfDiscs-1, from,inter,to);
		System.out.println("Moving disc "+ noOfDiscs+" from "+ from +" to "+ to);
		move(noOfDiscs-1, inter, to , from);
		
	}
	public static void main(String[] args) {
		TowerOfHonai toh = new TowerOfHonai();
		toh.move(3, 'A', 'C', 'B');
	}
	
}
