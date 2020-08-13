package com.shekhar.string;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		String s1 = scan1.nextLine();
		String s2 = scan1.nextLine();
		
		System.out.println(isAnagram(s1, s2));
		
	}
	
	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		
		char[] char1 = a.toLowerCase().toCharArray();
		char[] char2 = b.toLowerCase().toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		if(Arrays.equals(char1, char2)) {
			return true;
		}else {
			return false;
		}
	}

}
