package com.techment.day13;

interface Calculation     //functional interface: has only 1 abstract method
{
	void display();
}

class Hello
{
	void message()         //non static
	{
		System.out.println("today is holiday");
	}
}

public class MethodReference1 {

	public static void main(String[] args) {
		//lamda
		Calculation calculation = ()-> System.out.println("this is display method using lamda expression");
		calculation.display();
		
		//non static
		Hello hello = new Hello();
		Calculation calculation2 = hello::message;
		calculation2.display();

	}

}
