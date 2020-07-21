package com.shekhar.collection;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("ABCD");
		int i = 1;
		int j = 0;
		StringBuilder builder1 = new StringBuilder("10");
		builder1.insert(j, i);
		System.out.println(builder1);
//		System.out.println(builder.capacity() + builder1.capacity());
//		Integer.max(a, b)
		
		
	}

}
