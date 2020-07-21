package com.shekhar;

import java.text.DecimalFormat;

public class Formatter {

	public static void main(String[] args) {
		long n = 4545409;
//		System.out.format("%,d%n", n);
		
		customFormat("###,###.000", 123456.78);
		customFormat("###.##", 123456.781);
		customFormat("000000.000", 123.78);
		customFormat("$###,###.###", 12345.67);

	}
	
	static public void customFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println(value + "  " + pattern + "  " + output);
	}

}
