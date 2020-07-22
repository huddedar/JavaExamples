package com.shekhar.collectionDemo;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(5);
		treeSet.add(7);
		
		System.out.println(treeSet.floor(4));
		System.out.println(treeSet.ceiling(4));
	}

}
