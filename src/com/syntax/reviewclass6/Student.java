package com.syntax.reviewclass6;

public class Student {

	String name;
	String gender;
	String course;
	String division;
	
	//we ahve three methods below--these are void which the behavior of the person

	void sleep() {
		
		System.out.println(name + " sleep alot");
	}
	
	void study() {
		
		System.out.println(name + " study in " + course);
	}
	void studentInformation() {
		System.out.println(name +" secured " + division + " division");
	}
}
