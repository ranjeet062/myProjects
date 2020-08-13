package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		for(int i =1; i <=100; i++)
		{
			l.add(i);
		}
		
		Stream<Integer> sData = l.stream();
		sData.filter(i -> i> 90).mapToInt(i -> i).sum();
		
		Stream<Integer> refSData = l.stream();
		refSData.filter(i -> i> 90).forEach(a -> System.out.println("Sequential Data : "+ a));
		
		Stream<Integer> pData = l.parallelStream();
		pData.filter(i -> i> 90).mapToInt(i -> i).sum();
		
		Stream<Integer> refPData = l.stream();
		refPData.filter(i -> i> 90).forEach(a -> System.out.println("Parallel Data : "+a));
		
	}

}
