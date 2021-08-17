package com.techment.newfeature;

@FunctionalInterface
interface Bank
{
	void rateOfInterest();
	default void display()
	{
		System.out.println("this is a default method");
	}
	static void loan()
	{
		System.out.println("you can apply for loan");
	}
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		

	}

}
