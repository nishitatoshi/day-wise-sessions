package com.techment.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //<bean id="employee" class="com.techment.Employee">
public class Employee {
	
	
	@Autowired
	Address address;
	
	public void displayDetails()
	{
		address.AddressDetails();
	}

}
