package com.techment.string;

public class Immutable {

	public static void main(String[] args) {
		
		String courseName="java";
		System.out.println("courseName "+courseName);
		courseName.concat("programming");
		System.out.println("after concat "+courseName);
		courseName=courseName.concat(" language");
		System.out.println("courseName again "+courseName);




	}

}
