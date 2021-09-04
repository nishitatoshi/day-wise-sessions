package com.techment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee700")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String d;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, String d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	

}
