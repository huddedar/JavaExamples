package com.shekhar.optional;

import java.util.Optional;

public class OptionalDemo3 {

	public static void main(String[] args) {
		Optional<Integer> optional = Optional.ofNullable(null);
		String s = optional.map(i -> "abc").get();
		System.out.println(s);

	}

}
