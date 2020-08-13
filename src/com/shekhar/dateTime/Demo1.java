package com.shekhar.dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Demo1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 8, 05);
		DayOfWeek day = date.getDayOfWeek();
		String s = DayOfWeek.values()[day.getValue() - 1] .toString();
		System.out.println(s);
	}

}
