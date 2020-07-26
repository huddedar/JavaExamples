package com.shekhar.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamDemo3 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("1", "2", "3", "4", "5");
		
		List<Integer> listInt = strList.stream().map(Integer::parseInt).collect(Collectors.toList());
		
//		System.out.println(listInt);
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 0);
		List<Integer> list3 = Arrays.asList(11, 12, 13, 14, 15);
		
		List<List<Integer>> data = Arrays.asList(list1, list2, list3);
		
		List<Integer> bigData = data.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		
		System.out.println(bigData);
	}

}
