package com.techment.day8;
import java.util.ArrayList;
import java.util.Collections;
class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.age==o.age)
			return 0;
		else if(this.age>o.age)
			return 1;
			else 
				return -1;
	}
	@Override
	public String toString()
	{
		return emp.id + emp.name +  emp.dept + emp.age;
	}
	
}

public class UserDefinedExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "sahin" ,"hr", 45));
		employees.add(new Employee(2, "rahul","manager", 46));
		employees.add(new Employee(3, "sahil","hr", 47));
	    employees.add(new Employee(4, "tom" ,"hr", 47));
        
	    for(Employee emp : employees);
	    {
	    System.out.println("after sortig");
	    }
				Collections.sort(employees);
				
				for(Employee e:a)
				{
					System.out.println(e.id);
					System.out.println(e.name);
					System.out.println(e.dept);
					System.out.println(e.age);



				}
				
				System.out.println("====after sorting===");
				for(Employee emp : employees)
				{
					System.out.println(emp.id + " " + emp.name + " " + emp.dept + " " + emp.age);
				}

	}

}
