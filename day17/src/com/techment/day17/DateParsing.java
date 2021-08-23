package com.techment.day17;

import java.time.LocalDate;

public class DateParsing {

	public static void main(String[] args) {

		String dob = "30/10/1999";
		String joiningDate = "2020-02-22";
		System.out.println("dob is: "+dob);
		System.out.println("joining date: "+joiningDate);
		
		//parsing for joining date
		LocalDate joiningDateAfterParsing = LocalDate.parse(joiningDate);
		System.out.println(joiningDateAfterParsing);
		
		System.out.println(joiningDateAfterParsing.getYear());
		System.out.println(joiningDateAfterParsing.getMonth());

        System.out.println("=============sample============");
        LocalDate today = LocalDate.now();
        LocalDate joiningdate = LocalDate.parse(joiningDate);
        LocalDate birthdate = LocalDate.of(1999, 10, 30);
	}

}
