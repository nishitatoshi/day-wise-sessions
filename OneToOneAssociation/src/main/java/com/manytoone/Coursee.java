package com.manytoone;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course400")
public class Coursee {
	
	@Id
	int id;
	String courseName;
	int duration;
	
	@ManyToOne
	Studentt sachin;

	
	public Coursee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coursee(int id, String courseName, int duration) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	

}
