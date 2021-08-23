package com.techment.day17;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate bday = LocalDate.of(1999, 10, 30);
		Period period = Period.between(bday, today);
		System.out.println(period.getYears()+" years "+period.getMonths()+" months "+period.getDays()+" days ");
		
		System.out.println(bday.isBefore(today));
	}

}
