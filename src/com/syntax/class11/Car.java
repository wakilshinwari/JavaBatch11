package com.syntax.class11;

public class Car {

	//to define attributes
	String make;
	String model;
	String color;
	int year;
	double milage;
	void moveForward() {  //we can define behavoir like this 
		System.out.println("Moving forward");
	}
	void applyBrakes() {
		System.out.println("Apllying Brakes");
	}
	
  public static void main(String[] args) {
	  
	  Car ayshaCar=new Car();
	  
	  ayshaCar.make="Tesla";
	  ayshaCar.model="S";
	  ayshaCar.color="Black";
	  
     
	System.out.println("Ayshas Car is "+ayshaCar.make);
	System.out.println("Ayshas Car model is "+ayshaCar.model);
	System.out.println("Ayshas Car color is "+ayshaCar.color);
	
	ayshaCar.moveForward();
	ayshaCar.applyBrakes();
	
}
}
