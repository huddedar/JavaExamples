package com.shekhar.collectionDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("A", 3);
		treeMap.put("B", 2);
		treeMap.put("C", 1);
		
		Map.Entry<String, Integer> ceiling = treeMap.ceilingEntry("B");
		
		System.out.println(ceiling.getValue());
	}

}
