package com.shekhar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 02, 2);
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("yy mm dd");
		String dateaStr = date.format(formater);
		System.out.println(dateaStr);
	}

}
