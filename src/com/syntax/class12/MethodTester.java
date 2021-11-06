package com.syntax.class12;

public class MethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("line before method call");
		
		Methods methods=new Methods (); //we are creating an object of Methods class
		methods.sayHello();  //to print the 
		
		methods.sayHelloManyTimes();
		methods.times=3;
		methods.sayHelloManyTimesWithStateParameter(15);
		System.out.println("Line after method call");

	}

}
