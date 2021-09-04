package com.techment.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {
	
	ArrayList<Employee> employees= new ArrayList<Employee>();
	
	public EmployeeController() {
		employees.add(new Employee(1, "sachin", "hr"));
		employees.add(new Employee(2, "rahul", "developer"));
		employees.add(new Employee(3, "kumar", "developer"));


	}
	
	
	@GetMapping(value = "/showMessage")
	public String display()
	{
		return"this is my first demo";
	}
	
	
	@GetMapping(value = "/getAllEmployees")
	public ArrayList<Employee> showEmployees()
	{
		return employees;
	}

	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping(value="addNewEmployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getD());
		employees.add(employee);
		
		return "employee added";
	}
}
