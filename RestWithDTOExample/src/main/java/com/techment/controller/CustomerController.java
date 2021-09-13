package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.exception.IDNotFoundException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value="/customerController")
public class CustomerController {
	
	@Autowired
	ICustomerService service;
	
	@GetMapping(value="/viewAllCustomers")
	public List<CustomerDto> viewCustomer(@RequestHeader String token)
	{
		return service.viewAlCustomers();
	}
	
	@PostMapping(value="/InsertCustomer")
	public String addNewCustomer(@RequestBody CustomerDto customer)
	{
		service.addCustomer(customer);
		return "inserted";
	}
	
	@GetMapping(value = "/customerById/{id}")
	public CustomerDto getByid(@PathVariable int id)
	{
		CustomerDto customer = service.viewCustomerById(id);
		return customer;
	}

	@ExceptionHandler(value=IDNotFoundException.class)
	public ResponseEntity<Object> myException(IDNotFoundException exception)
	{
	
		try
		{
			return new ResponseEntity<Object>(exception.getMsg(), HttpStatus.NOT_FOUND);

		}
		catch (NoSuchElementException e)
		{
			throw new IDNotFoundException("no id present");
		}
	}
}
