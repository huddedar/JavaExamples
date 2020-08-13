package com.shekhar.string;

public class Demo3 {

	static int x = 10;
	
	public static void main(String... args) {
		String city = " Ab-b d ";
		city = city.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(city);
	}

}
