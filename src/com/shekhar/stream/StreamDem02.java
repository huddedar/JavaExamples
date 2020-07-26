package com.shekhar.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDem02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
//		List<Integer> evenInts = list.stream().filter(l -> l % 2 == 0).peek(i -> System.out.println(i))
//				.collect(Collectors.toList());
//		
//		Set<Integer> intSet = list.stream().filter(l -> l % 2 == 0).collect(Collectors.toSet());
//		
//		System.out.println(intSet);
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		
//		memberNames.stream().sorted().map(String::toUpperCase).filter(m -> m.startsWith("A"))
//				.forEach(System.out::println);
		
		boolean matched = memberNames.stream().allMatch(m -> m.startsWith("A"));
		
		System.out.println(matched);
		
	}

}
