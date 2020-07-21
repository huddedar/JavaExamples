package com.shekhar;

public class Reference {
	
	public int value;
	static double s;
	

	public static void main(String[] args) {
		
//		short sh = 1;
//		
//		sh += 10;
//		sh++;
//		
//		sh = sh + 1;
		
		assert args == null : "Null";
		System.out.println("All OK");
		
//		Character c = Character.of("C");
		
//		Reference ref = new Reference();
//		int i = 0;
//		referenceMethod(ref);
//		premitiveMethod(i);
//		System.out.println(ref.value);
//		System.out.println(i);
		
//		System.out.println(s);
		
//		Object obj = objectBuilder();
//		int j = primitiveBuilder();
//		
//		System.out.println(obj.toString());
//		System.out.println(j);
	}

	public static Object objectBuilder() {
		return new Object();
	}
	
	public static int primitiveBuilder() {
		return 1;
	}
	
	public static void referenceMethod(Reference ref) {
		ref.value++;
	}
	
	public static void premitiveMethod(int i) {
		i++;
		System.out.println("primitive value in method :" + i);
	}
	
	
}
