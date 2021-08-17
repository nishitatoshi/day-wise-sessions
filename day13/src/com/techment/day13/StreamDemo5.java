package com.techment.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamDemo5 {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "nishita", "developer", 120000, 22));
		employees.add(new Employee(2, "sachin", "hr", 40000, 42));
		employees.add(new Employee(3, "kumar", "hr", 6000, 26));
		employees.add(new Employee(4, "ravi", "hr", 2000, 32));
		employees.add(new Employee(5, "john", "developer", 80000, 22));
		employees.add(new Employee(6, "sam", "manager", 90000, 42));

		
		//List<String> li = employees.stream().map (e->"name " + e.getName() + " salary " + e.getSalary()+ " salary increased by 20% "+(e.getSalary() + e.getSalary()*0.20)).forEach(System.out::println);
		employees.stream().map(e->"Name : "+e.getName()+" Salary :"+e.getSalary()+" Salary increased by 20% = "+(e.getSalary()+e.getSalary()*0.20)).forEach(System.out::println);
		List<Employee> li=employees.stream().collect(Collectors.toList());
		StreamDemo5 streamDemo5 = new StreamDemo5();
		Long hrSumSalary = streamDemo5.deptWiseSumSalary(employees, "develooper");
		System.out.println("total hr sum salary "+ hrSumSalary);
		
		int maximumSalary = streamDemo5.maxSalary(employees);
		System.out.println("maximum salary "+ maximumSalary);
		
		int minimumSalary = streamDemo5.minSalary(employees);
		System.out.println("minimum salary "+ minimumSalary);

		
	}
	
	/**
	 * Description: this method finds the sum of salary dept wise
	 * @param employees
	 * @param dept
	 * @return
	 * date- 17 aug
	 */
	
	Long deptWiseSumSalary(ArrayList<Employee> employees, String dept)
	{
		Long sumSal = employees.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
	    return sumSal;
	}
	
	int maxSalary(ArrayList<Employee> employees)
	{
		int maxSal = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
		return maxSal;
	}
	
	int minSalary(ArrayList<Employee> employees)
	{
		int minSal = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMin();
		return minSal;
	}

}
