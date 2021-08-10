package com.techment.oops;

class Customer
{
	int id;
	String name;
	Account account;// object reference
	public Customer(int id, String name, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}
	
	void displayCustomerInfo()
	{
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("accountNo: "+account.accountNo);
		System.out.println("type: "+account.type);
		System.out.println("branch: "+account.type);
		System.out.println("balance: "+account.balance);


	}
}

class Account
{
	int accountNo;
	String type;
	String branch;
	int balance;
	public Account(int accountNo, String type, String branch, int balance) {
		super();
		this.accountNo = accountNo;
		this.type = type;
		this.branch = branch;
		this.balance = balance;
	}
	
	
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account(101 , "savings" , "ambikapur" , 1000);
		Customer customer = new Customer(1 , "nishi" , account);
		customer.displayCustomerInfo();

	}
}