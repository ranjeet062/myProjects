package com.map.problems;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSort {

	public static void main(String[] args) {
		
		Map<String , Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		System.out.println(map);
		System.out.println(sort(map));
	}
	
	public static Map<String, Integer> sort(Map<String, Integer> map)
	{
		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<String , Integer> temp = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> aa :list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}
}
