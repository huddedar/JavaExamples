package com.shekhar.stream;

import java.util.stream.Stream;

public class StringDemo4 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of();
		boolean isMatched = stream.allMatch(s -> s.equals("Test"));
		System.out.println(isMatched);
	}

}
