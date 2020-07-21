package com.shekhar;

public class CastingDemo {

	static int i = 10;
	
	public static void main(String[] args) {
		Object obj = Integer.valueOf(i);
		String s = (String)obj;
		System.out.println(s);
	}

}
