package com.shekhar;

public class WithoutMain {
	static {
		System.out.println("I am running without main");
	}
	
	public static void main(String... args) {
		String s = "1";
		try {
			System.out.println(Integer.parseInt(s));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
