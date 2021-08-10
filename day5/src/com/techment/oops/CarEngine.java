package com.techment.oops;


class Car
{
	int model;
	String name;
	int engineNo;
	Engine engine;
	public Car(int model, String name, Engine engine) {
		super();
		this.model = model;
		this.name = name;
		this.engine = engine;
	}
	
	void displayCarInfo()
	{
		System.out.println("model: "+model);
		System.out.println("name: "+name);
		System.out.println("engine: "+engineNo);
		System.out.println("engine id: "+engine.engineId);
		System.out.println("type: "+engine.type);


	}
}

class Engine
{
	int engineId;
	String type;
	
	public Engine(int engineId, String type) {
		super();
		this.engineId = engineId;
		this.type = type;
	
	}
	
	
}

public class CarEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(101 , "Ferrari" , engine);
		Engine engine = new Engine(1234 , "racing");
		car.displayCarInfo();

	}
	
}