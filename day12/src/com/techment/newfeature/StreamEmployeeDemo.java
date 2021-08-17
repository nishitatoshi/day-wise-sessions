package com.techment.newfeature;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "nishita", "developer", 20000, 22));
		employees.add(new Employee(2, "sachin", "hr", 40000, 42));
		employees.add(new Employee(3, "kumar", "hr", 6000, 26));
		employees.add(new Employee(4, "ravi", "hr", 2000, 32));
		employees.add(new Employee(5, "john", "developer", 80000, 22));
		employees.add(new Employee(6, "sam", "manager", 90000, 42));

		employees.stream().forEach(s->System.out.println(s));
		
		//to count number of employees
		Long empcount =employees.stream().count();
		System.out.println("total num of employees: "+empcount);
		
		//find number of developers
		Long devCount = employees.stream().filter(e->e.getDept().equals("developer")).count();
		System.out.println("developer count: "+devCount);
		
		//display only dev details
		employees.stream().filter(e->e.getDept().equals("developer")).forEach(e->System.out.println(e.getName()));
		List<Employee> emp=employees.stream().filter(e->e.getDept().equals("developer")).collect(Collectors.toList());
		System.out.println(emp);
		
		//number of employees
		Long numOfEmployee = employees.stream().collect(Collectors.counting());
		System.out.println("number of employees: "+numOfEmployee);
        
		//total salary
		Long totalSalary = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("total salary: "+totalSalary);
		
		//max salary
		int maxSalary = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
		System.out.println("max salary: "+maxSalary);
		
		//long names
		long noOfBigNames = employees.stream().filter(e -> e.getName().length() > 5).count();
		System.out.println("number of big names: "+noOfBigNames);		
		
		//sort
		//employees.stream().sorted().forEach(System.out::println);
		
       // employees.stream().map(e->e.getName().length.forEach(System.out.println);
		
		DoubleSummaryStatistics employeeStats = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        
		System.out.println("Highest Salary : "+employeeStats.getMax());
		         
		System.out.println("Lowest Salary : "+employeeStats.getMin());
		         
		System.out.println("Average Salary : "+employeeStats.getAverage());
		
		//grouping
		Map<String, List<Employee>> employeessGroupedByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(employeessGroupedByDepartment);
		
		
		//partitioning
		Map<Boolean, List<Employee>> employeesspartionedBySalary = employees.stream().collect(Collectors.partitioningBy(Employee -> employees.equals(90000)));
		System.out.println(employeesspartionedBySalary);


		
		
		StreamEmployeeDemo obj = new StreamEmployeeDemo();
		List<Employee> empDepts = obj.filterByDept(employees, "developer");
		System.out.println(empDepts);
	}

	
	
	List filterByDept(ArrayList<Employee> empList, String dept)
	{
		List<Employee> emp = empList.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		return empList;
		
		
	}
}
