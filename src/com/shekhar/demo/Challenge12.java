package com.shekhar.demo;

public class Challenge12 {

	public static void main(String[] args) {
		String s = "howToDoItInJava";
//		s = s.replaceAll("[A-Z]", " ");
		String[] data = s.split("[A-Z]");
		System.out.println(s.split("[A-Z]").length);
	}

}
