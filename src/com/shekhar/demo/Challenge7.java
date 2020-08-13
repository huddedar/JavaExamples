package com.shekhar.demo;

import java.lang.reflect.Method;

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
   
}

public class Challenge7 {

	public static void main(String[] args) {
		
		try {
			Class student = Class.forName("Student");
			Method[] methods = student.getDeclaredMethods();
			
			for(Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		add(1, 2, 3, 5, 10, 20);
	}
	
	public static int add(int... val) {
		int sum = 0;
		String output = "";
		for(int i = 0; i < val.length; i++) {
			if (i == val.length - 1) {
				output += val[i];
			}else {
				output += val[i] + "+";
			}
			sum += val[i];
		}
		System.out.println(output + "=" + sum);
		return sum;
	}

}
