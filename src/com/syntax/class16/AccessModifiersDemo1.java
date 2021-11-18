package com.syntax.class16;

public class AccessModifiersDemo1 {

	
	private String name;
	int age;
	double salary;
	
	void displayName() {
		
		System.out.println(name);
	}
	
	void displayage() {
		System.out.println(age);
		
	}
	
	void displaySalary() {
		System.out.println(salary);
		
	}
	
	public static void main (String[]args) {
		AccessModifierDemo1 am=new AccessModifierDemo1();
				am.name="Nabil";
				am.age=22;
				am.salary=1200000;
}
}