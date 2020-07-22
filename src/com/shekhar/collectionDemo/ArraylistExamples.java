package com.shekhar.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExamples {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(null);
		list.add(0);
		list.add(new Integer(0));
		
		System.out.println(list);
	}

}
