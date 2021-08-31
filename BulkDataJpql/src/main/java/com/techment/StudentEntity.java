package com.techment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="student500")
public class StudentEntity {
	@Id
	private int studentId;
	private String dept;
	private String name;
	public StudentEntity(int studentId, String dept, String name) {
		super();
		this.studentId = studentId;
		this.dept = dept;
		this.name = name;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	
	

}
