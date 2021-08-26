package com.techment.model;

public class Employee {

	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("name constructor called");
	}

	

	public Employee(int salary) {
		super();
		this.salary = salary;
		System.out.println("salary constructor called");
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	//to print all the variable values addthese to object.xml
	//<constructor-arg value="sachin"></constructor-arg>
	//<constructor-arg value="30000"></constructor-arg>

	
}
