package com.techment.day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class AgeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
          if(o1.getAge()==o2.getAge())
        	  return 0;
          else if(o1.getAge()>o2.getAge())
        	  return 1;
          else 
        	  return -1;
	}
	
}

public class StreamSortDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "nishita", "developer", 20000, 22));
		employees.add(new Employee(2, "sachin", "hr", 40000, 42));
		employees.add(new Employee(3, "kumar", "hr", 6000, 26));
		employees.add(new Employee(4, "ravi", "hr", 2000, 32));
		employees.add(new Employee(5, "john", "developer", 80000, 22));
		employees.add(new Employee(6, "sam", "manager", 90000, 42));

		employees.forEach(System.out::println);
		
		//we created age class for these 2 lines
		System.out.println("==========sorting based on age==========");
		employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
		
		//direct method without creating age class
		System.out.println("=============using comparing int========");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
		
		//reverse
		System.out.println("=============reverse order========");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);

		//sort by name
		System.out.println("========sort by name============");
		List<Employee> emp = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		emp.forEach(System.out::println);
	}

}
