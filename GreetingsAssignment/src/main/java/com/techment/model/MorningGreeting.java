package com.techment.model;

import org.springframework.stereotype.Repository;

@Repository
public class MorningGreeting implements Greeting {

	String greeting="have a good day";
	
	
	public MorningGreeting(String greeting) {
		super();
		this.greeting = greeting;
	}
	
	


	
	public MorningGreeting() {
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
