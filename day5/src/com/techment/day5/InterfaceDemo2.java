package com.techment.day5;


interface Bank1
{
	rateOfInterest();
}

class Axis implements Bank1
{
	@Override
	public void rateOfInterest()
	{
		System.out.println("4%");
	}
}
public class InterfaceDemo2 {
	public static void main(String[] args)
	{
		Bank1 bank1 = new Axix();
		bank1.rateOfInterest();
	}

}
