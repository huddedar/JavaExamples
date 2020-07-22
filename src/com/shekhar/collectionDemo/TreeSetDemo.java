package com.shekhar.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("B"); list.add("B");
		list.add("A"); list.add("A");
		
		TreeSet<String> set = new TreeSet<String>(list);
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
