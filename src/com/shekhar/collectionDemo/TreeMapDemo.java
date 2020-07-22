package com.shekhar.collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "B");
		map.put(1, "A");
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(map);
		
		for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

}
