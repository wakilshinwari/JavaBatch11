package com.syntax.class17;

public class Car {

	//we can make our feilds private
	private String name;
	private String make;
	private String model;
	private String color;
	private int year;
	private int engine;
	private int engineCC;
	private String VIN;
	private int mileage;
	private int maxSpeed;
	private boolean sunroof;  //we create a constructor
	
	public Car() {
		
	}
	public Car(String carName) {
		
	}
	public Car (String carName, String carMake, String carModel, String carColor, int carYear, 
			int carEngine, int carEngineCC, String carVin, int carMaxSpeed, int carMileage, boolean carSunroof) {
		
		name=carName;
		make=carMake;
		model=carModel;
		color=carColor;
		year= carYear;
		engine=carEngine;
		engineCC=carEngineCC;
		VIN   = carVin;
		mileage=carMileage;
		maxSpeed=carMaxSpeed;
		sunroof=carSunroof;
		
	}
	public void printName() {
		
		System.out.println(name);
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	
}
