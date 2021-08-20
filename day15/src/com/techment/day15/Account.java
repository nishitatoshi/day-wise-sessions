package com.techment.day15;

public class Account {

	int balance=0;
	synchronized public int withdraw(int amount)
	{
		if(amount>balance)
		{
			try {
				System.out.println("no balance, waiting to deposit");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() +" is going to withdraw");
		balance-=amount;
		return balance;
	}
	
	synchronized public int deosit(int amount)
	{
		System.out.println(Thread.currentThread().getName() +" is going to deposit");
        balance+=amount;
        notify();
		return balance;
	}
}
