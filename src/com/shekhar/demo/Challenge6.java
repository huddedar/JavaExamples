package com.shekhar.demo;

import java.util.Scanner;

public class Challenge6 {

	static int B;
	static int H;
	static boolean flag;
	
	static {
		
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();
		
		if( B > 0 && H > 0) {
			flag = true;
		}else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
		scanner.close();
	}
		
	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
	}//end of main

}
