package com.shekhar;

public class AssertionDemo {

	public static void main(String[] args) {
		try {
			assert args == null : "Null";
			System.out.println("ok");
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			if ( e instanceof ArrayIndexOutOfBoundsException) {
				e = new ArrayIndexOutOfBoundsException();
			}
		}
	}

}
