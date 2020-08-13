package com.shekhar.inheritance;

public class Demo2 {

	abstract class Book{
	    String title;
	    abstract void setTitle(String s);
	    String getTitle(){
	        return title;
	    }
	}
	
	class MyBook extends Book {

		void setTitle(String s) {
			this.title = s;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
