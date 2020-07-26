package com.shekhar.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo2 {

	public static void main(String[] args) {
		
		Stream<Integer> intStream = Stream.of(0);
		Optional<Integer> on = intStream.findFirst();
		int t = on.filter(i -> i %2 == 0).orElseGet(() -> 1);
		System.out.println(t);
	}

}
