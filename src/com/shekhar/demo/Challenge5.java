package com.shekhar.demo;

import java.util.Scanner;

public class Challenge5 {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		int counter = 0;
		
		while(scanner.hasNext()) {
			
			String line = scanner.nextLine();
			
			System.out.println(++counter + " " + line);
		}
		
		scanner.close();

	}

}
