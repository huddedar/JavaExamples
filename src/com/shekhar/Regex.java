package com.shekhar;

public class Regex {

	public static void main(String[] args) {
		String regEx = "[^A-Za-z]+";
		
		String s = "                        ";
		s = s.trim();
		s = s.replaceAll(regEx, " ");
		
		if(s.length() == 0) {
			System.out.println("0");
			return;
		}
		
		String[] arr = s.split(" ");
		
		System.out.println(arr.length);
		
		for(String str : arr) {
			System.out.println(str);
		}
		
		
	}

}
