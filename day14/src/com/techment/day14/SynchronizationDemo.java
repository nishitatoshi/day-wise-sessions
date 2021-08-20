package com.techment.day14;

class Water
{
	synchronized public void drinkWater(int time)
	{
		//synchronized (this)
		//{
		for(int i=0; i<=time; i++)
		    {
			     System.out.println(Thread.currentThread().getName()+ " is drinking water "+ i + " times");
		    }
		//}
		for(int i=0; i<=time; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " is eating "+ i + " times");
		}
	}
}

class WaterBottle extends Thread
{
	Water water = new Water();
	
	@Override
	public void run()
	{
		water.drinkWater(5);
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		
		WaterBottle waterBottle = new WaterBottle();
		//waterBottle.start();
		Thread person1 = new Thread(waterBottle);
		Thread person2 = new Thread(waterBottle);
		Thread person3 = new Thread(waterBottle);

		person1.setName(" Nishita");
		person2.setName(" Mohima");
		person3.setName(" Himanshi");
		
		person1.start();
        person2.start(); 
		person3.start();
		
	}

}
