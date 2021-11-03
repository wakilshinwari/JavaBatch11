package com.syntax.class10;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// i want to create an array and store elements using scanner

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter how many elements you want to stroe inside array of cars");
		
		int size=scan.nextInt();
		
		String[]cars=new String[size];
		
		// we can go with cars.lenght or size or 2/3
		
		//this loop is storing elements inside an array of cars
		for (int i=0; i<cars.length; i++) {
			System.out.println("Please enter your cars");
			
			cars[i]=scan.next();
		}
		
		//retrieve all stored elements   //lets use enhanced for loop
		
		for (String car:cars) {
			System.out.print(car+" ");
			
		}
	}

}
