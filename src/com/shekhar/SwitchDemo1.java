package com.shekhar;

public class SwitchDemo1 {

	public static void main(String[] args) {
		String s = new String("Demo");
		switch(s) {
		default :
			System.out.println("2");
			break;
		case "Demo":
			System.out.println("1");
		case "2":
			System.out.println("3");
		case "4":
			System.out.println("4");
		}

	}

}
