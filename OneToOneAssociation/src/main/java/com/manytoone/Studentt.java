package com.manytoone;


import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student400")
public class Studentt {
	
	@Id
	int id;
	String name;
	
	//List<Studentt> stud;
	

//	public List<Studentt> getStud() {
//		return stud;
//	}
//	public void setStud(List<Studentt> stud) {
//		this.stud = stud;
//	}
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
	

	
	

}
