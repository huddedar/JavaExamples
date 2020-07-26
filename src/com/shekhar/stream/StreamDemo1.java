package com.shekhar.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
//		Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
//		intStream = Stream.of(new Integer[] {1, 2, 3, 4, 5});
		
		List<Integer> stream = new ArrayList<Integer>();
		stream.add(1); stream.add(2); stream.add(3);
		
		stream.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
//				System.out.println(i);
			}
		});
		
//		stream.forEach(s -> System.out.println(s));
		
//		Stream.generate(new Supplier<Date>() {
//			public Date get() {
//				return new Date();
//			}
//		}).forEach(d -> System.out.println(d));
		
		Stream<Date> dateStream = Stream.generate(() -> {
			return new Date();
		});
		
		dateStream.forEach(date -> {
//			System.out.println(date);
		});
		
		IntStream stream1 = "kdjsdk4343sd".chars();
		
		stream1.forEach(s -> System.out.println(s));
		
	}

}
