package com.techment.day17;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDate.now().getDayOfYear());
		System.out.println(LocalDate.now().getDayOfWeek());

        System.out.println("===================");
		LocalDate today = LocalDate.now();
        System.out.println("today is: "+today);
        
        System.out.println(today.plusMonths(2));
        System.out.println(today.plusYears(2));
        System.out.println(today.plusWeeks(2));
        System.out.println(today.plusDays(2));
        
        System.out.println("===================");
        System.out.println(today.minusYears(6).getDayOfWeek());

	}

}
