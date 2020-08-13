package com.shekhar;

import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		
		String s = "121.12.12.034";
		String pattern = "[0-255].[0-255].[0-255].[0-255]";
		
		Pattern.compile(s);
		
		boolean isMatch = Pattern.matches(pattern, s);
		
		System.out.println(isMatch);
	}

}
