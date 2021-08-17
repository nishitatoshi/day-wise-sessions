package com.techment.day13;

@FunctionalInterface
interface A
{
	Student getStudentDetails();
	
}

class Student
{
	int id;
	String name;
	
	
	void display()
	{
		System.out.println("this is student info");
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		//by lamda multi line
		A a = ()-> 
		{
		Student s = new Student();
		return s;
		};
		a.getStudentDetails().display();

		//by lamda single line
		A a1 =()-> new Student();
		a1.getStudentDetails().display();
		
		//by method reference
		A obj = Student::new;
		obj.getStudentDetails().display();

	}

}
