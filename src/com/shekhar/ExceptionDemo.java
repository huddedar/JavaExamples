package com.shekhar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			int[] arr = new int[0];
			
			File file = new File("temp.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			System.out.println(arr[0] + "" + arr[1]);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void doSomething() throws Exception{
		throw new Exception();
	}

}
