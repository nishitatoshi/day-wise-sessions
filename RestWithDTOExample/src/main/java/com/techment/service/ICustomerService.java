package com.techment.service;

import java.util.List;

import com.techment.dto.CustomerDto;

public interface ICustomerService {
	
	String addCustomer(CustomerDto customerDto);
	List<CustomerDto> viewAlCustomers();
	CustomerDto viewCustomerById(int id);
	CustomerDto deleteCustomerById(int id);
}
