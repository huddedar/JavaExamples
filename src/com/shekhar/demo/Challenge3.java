package com.shekhar.demo;

import java.util.Scanner;

public class Challenge3 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for (int j = 0; j < n; j++) {
            	 
            	int temp1 = (int) (Math.pow(2, j) * b);
            	  
            	 a += temp1;
            	  
            	  System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }

}
