package com.techment.model;

import org.springframework.stereotype.Repository;

@Repository
public class GoodDayGreeting implements Greeting {

	String greeting="have a good day";
	
	public GoodDayGreeting(String greeting) {
		super();
		this.greeting = greeting;
	}
	
	

	public GoodDayGreeting() {
		super();
	}



	public String getGreeting() {
		return greeting;
	}



	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}



	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
