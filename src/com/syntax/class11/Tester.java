package com.syntax.class11;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human tamana=new Human();
		
		tamana.name="Tamana";
		tamana.age=16;
		tamana.height=5.8;
		tamana.weight=30;
		tamana.gender='F';
		tamana.bloodType="A+";
		
		tamana.eat();
		tamana.sleep();
		tamana.walk();
		tamana.sendMemes();
		
		System.out.println("***************");
		
		Human sebastian=new Human();
		sebastian.name="sebastian";
		
		tamana.name="sebastian";
		tamana.age=18;
		tamana.height=6.2;
		tamana.weight=100;
		tamana.gender='M';
		tamana.bloodType="A-";
		
		sebastian.eat();
		sebastian.sleep();
		sebastian.walk();
		sebastian.sendMemes();
	
	}

}
