package com.shekhar.demo;

import java.math.BigInteger;

interface PerformOperation {
	 boolean check(int a);
}

public class Challenge9 {

	public static void main(String[] args) {
		PerformOperation op =isPalindrome();
		System.out.println(checker(op, 121));
	}
	
	public static boolean checker(PerformOperation p, int num) {
		  return p.check(num);
	}
	
	public static PerformOperation isOdd() {		
		return (int i) -> i % 2 != 0;		
	}
	
	public static PerformOperation isPrime() {
		return (int i) -> new BigInteger(String.valueOf(i)).isProbablePrime(1);
	}
	
	public static PerformOperation isPalindrome() {
		return (int i) -> {
			StringBuilder builder = new StringBuilder(String.valueOf(i));
			String reverseString = new String(builder.reverse());
			return String.valueOf(i).equals(reverseString);
		};
	}
		

}
