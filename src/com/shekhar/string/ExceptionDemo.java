package com.shekhar.string;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
		try {
			long l = power(-1, 3);
			
			System.out.println(l);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static long power(int n, int p) throws Exception{
		
		if(n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}
		
		if(n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		}
		
		return (long)Math.pow(n, p);
		
	}

}
