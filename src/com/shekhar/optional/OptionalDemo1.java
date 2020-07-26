package com.shekhar.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo1 {

	public static void main(String[] args) {
//		Optional<String> str = Optional.empty();
		//str = Optional.of("String");
		//str = Optional.ofNullable(null);
//		if(str.isPresent()) {
//			System.out.println(str.get());
//		}
//		
//		System.out.println(str.orElse("No data"));

		
		Stream<String> s = Stream.of();
		
		Optional<String> opt = s.findAny();
		
		System.out.println(opt.get());
	}
	

}
