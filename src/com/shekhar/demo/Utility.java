package com.shekhar.demo;

public class Utility extends SuperClass implements Interface1, Interface2 {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println(utility.identifyMyself());
	}

	@Override
	public String identifyMyself() {
		Interface1.super.identifyMyself();
		Interface2.super.identifyMyself();
		return "i am good now";
	}
	
}
