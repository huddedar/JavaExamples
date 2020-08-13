package com.shekhar.string;

import java.util.Arrays;

public class Demo8 {

	public static void main(String[] args) {
		String b = "welcometojava";

	}

}

class MyCalculator /* implements AdvancedArithmetic */ {
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
