package com.techment;

public class Calculation {
	
	int add(int a,int b)
	{
		return a+b;
	}
	
	String checkEligibility(int age)
	{
		if(age>18)
			return "eligible";
		else
			return "not eligible";
	}

	String name="sachin";
}
