package com.shekhar.collectionDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("a"); arrayDeque.add("b"); arrayDeque.add("c");
		ArrayDeque<String> arrayDeque2 = new ArrayDeque<String>(arrayDeque);
		System.out.println(arrayDeque2.poll());
		System.out.println(arrayDeque2.peek());
		System.out.println(arrayDeque2.getFirst());
		System.out.println(arrayDeque2.peekLast());
		
	}

}
