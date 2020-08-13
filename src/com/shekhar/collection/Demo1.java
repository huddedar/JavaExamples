package com.shekhar.collection;

import java.math.BigInteger;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		String n = scanner.nextLine();
        BigInteger bigInt = new BigInteger(n);
        System.out.println(bigInt.isProbablePrime(1) ? "prime" : "not prime");
        scanner.close();

	}

}
