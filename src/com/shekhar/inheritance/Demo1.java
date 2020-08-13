package com.shekhar.inheritance;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

 class Adder extends Arithmetic {

	public Adder() {
		super();
	}
	 
	public Adder(int a, int b) {
		super(a, b);
	}
	 
 }

class Arithmetic{
	
	private int a;
	private int b;
	
	public Arithmetic() {
		
	}
	
	public Arithmetic(int a, int b) {
		this.setA(a);
		this.setB(b);
	}
	
	public int add(int a, int b) {
		return a + b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
