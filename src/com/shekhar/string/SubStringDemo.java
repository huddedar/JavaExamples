package com.shekhar.string;

import java.util.Scanner;

public class SubStringDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if(start > end) {
        	System.out.println("Invalid indices");
        }else if(!S.matches("^[a-zA-Z]*$")) {
        	System.out.println("Invalid String");
        }else {
        	System.out.println(S.substring(start, end ));
        }
        in.close();
	}

}
