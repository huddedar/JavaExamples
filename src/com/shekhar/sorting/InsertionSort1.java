package com.shekhar.sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSort1 {

	public static void insertionSort1(int[] unsorted) {
	    for (int i = 1; i < unsorted.length; i++) {
	      int current = unsorted[i];
	      int j = i;

	      // create right place by moving elements
	      while (j > 0 && unsorted[j - 1] > current) {

	        // move
	        unsorted[j] = unsorted[j - 1];
	        j--;
	      }

	      // found the right place, insert now
	      unsorted[j] = current;
	    }
	  }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		insertionSort1(arr);

		scanner.close();
	}
}
