package com.shekhar.string;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int[] a1 = {1, 3, 4, 5};
		int[] a2 = {1, 3, 4, 5};
		
//		System.out.println(a1 == a2);
//		System.out.println(Arrays.equals(a1, a2));
//		System.out.println(Arrays.deepEquals(a1, a2));
		
		try {
			method();
		}catch(FileNotFoundException e1) {
			System.out.println("In e1");
		}
		catch (IOException e1) {
			System.out.println("In e2");
		}
	}
	
	public static void method() throws IOException{
		throw new FileNotFoundException();
	}

}
