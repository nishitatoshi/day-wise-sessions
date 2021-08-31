package com.techment;

import javax.persistence.*;  

@Entity  
@Table(name="student500")  
public class StudentEntity {  
  
    @Id  
    private int studentId;  
    private String dept;  
    private String name;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}  
      
    
}  