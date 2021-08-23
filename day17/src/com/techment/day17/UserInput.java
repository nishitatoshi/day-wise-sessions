package com.techment.day17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your dob");
		String dob = scanner.next();
		System.out.println("your dob is: "+dob);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yy/MMM/dd");
		LocalDate birthdate = LocalDate.parse(dob, dtf1);
		System.out.println("birthday: "+birthdate);
		
		System.out.println("birthdate in given format: "+birthdate.format(dtf1));
		
	}

}
