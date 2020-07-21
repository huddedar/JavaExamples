package com.shekhar;

public class StringBufferDemo {

	public static void main(String[] args) {
		String oldText = "Whizlabs exam preparation";
		String newText = oldText.replace("\\s", "A");
		
		String string = "Whizlabs";
		String[] arr = string.split("\\S");
		
		System.out.println(arr.length);
	}

}
