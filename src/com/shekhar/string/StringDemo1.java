package com.shekhar.string;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		String[] strings = {"N", "L", "n", "O", "S"};
		Arrays.sort(strings);
		
		for(String str : strings) {
			System.out.println(str);
		}
	}

}
