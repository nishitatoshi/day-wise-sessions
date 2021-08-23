package com.techment.day17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatter2 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		DateTimeFormatter full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter longdate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter shortdate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

		System.out.println(today.format(full));
		System.out.println(today.format(longdate));
		System.out.println(today.format(medium));
		System.out.println(today.format(shortdate));
		
		LocalDateTime todaydateTime = LocalDateTime.now();
		System.out.println("today date time: "+todaydateTime);
		
		DateTimeFormatter fulltime =DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
       // System.out.println(todaydateTime.format(shortdate));
        
        ZonedDateTime date = ZonedDateTime.now();	
        System.out.println(date);
        System.out.println(date.format(fulltime));
	
	}

}
