package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.Employee;
import com.techment.dao.IDao;

@Service("dbservice")
public class DataBaseService {
	
	@Autowired
	@Qualifier("oracle")
	IDao dao;
	
	@Autowired
	Employee employee;
	
	public void displayDataBaseInfo()
	{
		dao.dataBaseName();
		employee.displayEmployeeInfo();
	}

}
