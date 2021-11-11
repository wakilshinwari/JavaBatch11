package com.syntax.class15;

public class Dog {

	
		// If I declare where Can I access that variable 
		//we have three varialbes 1. static local instance  
		//anything with brackets is block of code
		
		
		String name; //instance varialbe
		String color; //instance varible
		static int noOfLegs=4;
		
		void sleep() {
			int time=3; //it is a local variable 
			System.out.println(time);
			System.out.println(name+" is sleeping");
		}

		void eat () {
			//System.out.println(time); as time is a local variable we can access it outside of sleep method
			System.out.println(name+" can eat");
		}
	}
	
