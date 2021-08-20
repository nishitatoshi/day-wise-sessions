package com.techment.day14;

class Apple extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			if(i==2)
			{
				stop();
			}
		System.out.println("eat apple" + Thread.currentThread().getName());
		}
	}
}

class Banana extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
		System.out.println("eat banana" + Thread.currentThread().getName());
		}
	}
}
public class ThreadName {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		apple.setName(" Iam Apple Thread");
		banana.setName(" Iam Banana Thread");
		
		banana.setPriority(2);
		apple.setPriority(6);
		
		apple.start();
		banana.start();
		
		//banana.suspend();

	}

}
