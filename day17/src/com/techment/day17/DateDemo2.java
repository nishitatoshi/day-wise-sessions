package com.techment.day17;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		System.out.println(today.getDayOfWeek());
		System.out.println(today.plusYears(2).getDayOfWeek());
		System.out.println(today.plusYears(2).getDayOfWeek().toString().equals("WEDNESDAY"));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

	}

}
