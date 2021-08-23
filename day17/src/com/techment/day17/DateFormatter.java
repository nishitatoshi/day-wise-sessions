package com.techment.day17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy MM dd");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy MMM dd");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MMM dd");
		DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MMM/dd E");
		DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MMM dd EEEE");

		System.out.println(dtf1);
		System.out.println(dtf2);
		System.out.println(dtf3);
		System.out.println(dtf4);
		System.out.println(dtf5);
		System.out.println(dtf6);

	}

}
