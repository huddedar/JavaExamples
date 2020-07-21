package com.shekhar;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		
		for(int x = 10; x > 5; x++) {
			if(x == 16)
				x -= 11;
			System.out.println(x);
		}
//		int x = 0;
//		
//		for(x = 0;  x++ < 2; ) {
//			System.out.println(x);
//		}
		
//		while ((x = 0) <= 3) {
//			System.out.println(x);
//			x++;
//		}
		
//		Stream<String> names = Stream.of("John", "John1", "Jane");
//		
//		names.filter(n -> n.startsWith("A"));
//		
//		names.forEach(n -> System.out.println(n));
		
//		names.filter(n -> {
//			System.out.println(n);
//			return n.startsWith("John");
//		}).forEach(n -> System.out.println(n));
	}
	
}
