package com.syntax.class17;

public class Dog {
	
	//we are writing access modifiers for a constructor
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weigth;
	public Dog(String dogName, String dogColor, String dogBreed, int dogAge, double dogWeigth) {
		
		System.out.println("Dog constructor is called");
		name=dogName;
		color=dogColor;
		breed=dogBreed;
		age=dogAge;
		weigth=dogWeigth;
		
	}
	public void printName() {
		
		System.out.println(name);
	}
	public void printAge() {
		System.out.println(age);
	}
	public void printBreed() {
		System.out.println(breed);

}
}
