package com.shekhar.demo;

import java.security.MessageDigest;
import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hashBytes = digest.digest("HelloWorld".getBytes());
			for(byte hashByte : hashBytes) {
				System.out.printf("%02x", hashByte);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
