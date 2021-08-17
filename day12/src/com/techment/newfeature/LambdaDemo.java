package com.techment.newfeature;

interface Bank
{
	void display();
	
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		Bank bank =()->System.out.println("this is display method");
		bank.display();
		
		Bank bank2 =()->
		{
			System.out.println("this is display method");
			System.out.println("this is multi line method");

		};
		bank2.display();

	}

}
