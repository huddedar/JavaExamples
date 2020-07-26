package com.shekhar.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalDemo4 {

	public static void main(String[] args) {
		Stream<String> s = Stream.of();
		long c = s.count();
		System.out.println(c);
		
		Stream<Integer> intStream = Stream.of(1, 4, 2, 6, 7);
		Optional<Integer> val = intStream.min(Integer :: compareTo);
		System.out.println(val.get());
		
		intStream = Stream.of(1, 4, 2, 6, 7);
		val = intStream.max(Integer :: compareTo);
		System.out.println(val.get());
		
		intStream = Stream.of(1, 4, 2, 6, 7);
		Optional<Integer> val1 = intStream.reduce(Integer :: sum);
		System.out.println(val1.orElseGet(() -> -1));
		
		intStream = Stream.of(1, 4, 2, 6, 7);
		int val2 = intStream.reduce(10, Integer :: sum);
		System.out.println(val2);
		
		IntStream stream1 = IntStream.of(1, 4, 2, 6, 7);
		OptionalDouble optVal = stream1.average();
		stream1 = IntStream.of(1, 4, 2, 6, 7);
		int sum = stream1.sum();
		System.out.println(optVal.getAsDouble() + " " + sum);
		
		
	}

}
