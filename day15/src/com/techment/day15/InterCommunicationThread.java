package com.techment.day15;

public class InterCommunicationThread {

	public static void main(String[] args) {
		Account account = new Account();
		Thread t1 = new Thread()
				{
			public void run()
			{
				account.withdraw(3000);
			}
				};
				
		Thread t2 = new Thread()
				{
			public void run()
			{
				System.out.println("after deposit balance: "+ account.deosit(7000));
			}
				};
				
				t1.setName("ATM");
				t2.setName("Bank");
				
				t1.start();
				t2.start();

	}

}
