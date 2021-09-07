package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;
import com.techment.service.IEmployeeService;

@RestController
@RequestMapping(value = "/empController")
public class EmployeeControllerWithDb {
	
	@Autowired
	IEmployeeService iemployeeService;
	
	@GetMapping(value = "/viewAllEmployee")
	public ResponseEntity<List<Employee>> viewAllEmployee()
	{
		return new ResponseEntity<List<Employee>>(iemployeeService.viewAllEmployee(), HttpStatus.ACCEPTED);
		
		
	}

	@PostMapping(value = "/addNewEmployee")
	public ResponseEntity<String> addNewEmployee(@RequestBody Employee employee)
	{
		//return new ResponseEntity<String> (iemployeeService.addEmployee(employee), HttpStatus.ACCEPTED);
		iemployeeService.addEmployee(employee);
		return new ResponseEntity<String>("employee added..", HttpStatus.OK);
	}
	
	
	@GetMapping(value="/viewEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return iemployeeService.viewEmployeeById(id);
	}
}
