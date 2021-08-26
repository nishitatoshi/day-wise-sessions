package com.techment.model;

public class University {

	Department department;
	int noOfStudent;
	
	
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}

	



	public void displayDeptDetails()
	{
		department.deptDetails();
		System.out.println("number of students"+noOfStudent);
		System.out.println("hod name "+department.hodName);
	}
}
