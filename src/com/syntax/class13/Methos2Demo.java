package com.syntax.class13;

public class Methos2Demo {
	//let's build a method only print out the values of arrays

	void printArray(int [] array) {
		//becaue i only access the elements I can use enhanced for loops 
		
		for (int number:array) {
			System.out.println(number+ " ");
		}
	}
}
