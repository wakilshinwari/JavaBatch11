package com.syntax.class11;

public class Human {

	
	String name;
	int age;
	double height;
	double weight;
	char gender;
	String bloodType;
	
	void eat() {    //we can use name ( variable) in SYSout
		System.out.println(name+"eats alot ");
	}
	void sleep () {
		System.out.println(name+ " is sleeping ");
	}
	void walk () {
		System.out.println(name+" with bloodType"+bloodType+"is walking");
	}
	void sendMemes() {
		if (name.equals ("sebastian")) {
			System.out.println("Sending memes");
		}
	}
}
