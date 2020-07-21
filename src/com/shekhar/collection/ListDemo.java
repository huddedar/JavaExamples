package com.shekhar.collection;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add(0);
		boolean isDone = myList.set(1,  1);
		System.out.println(myList.get(0));
	}

}
