package com.shekhar.collection;

import java.math.BigInteger;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		String s1 = scaner.nextLine();
		String s2 = scaner.nextLine();
		
		BigInteger a = new BigInteger(s1);
		BigInteger b = new BigInteger(s2);
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		
		scaner.close();
	}

}
