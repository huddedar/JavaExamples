package com.shekhar.optional;

import java.util.Arrays;
import java.util.List;

public class OptionalDemo5 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("B", "A", "C");
		String str = list.stream().sorted().reduce(String :: concat).get();
		System.out.println(str);
	}

}
