package com.shekhar.string;

import static java.util.Arrays.*;

public class Demo2 {

	public static void main(String[] args) {
		try {
			Integer.parseInt("One");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("In Exception block");
		}
	}

}
