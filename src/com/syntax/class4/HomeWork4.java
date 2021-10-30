package com.syntax.class4;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
/* Create a Java program that will ask user to input city and temperature.
 *  Your program should convert Fahrenheit into celsius and print 
 *  “The temperature is the city __ is 
 * __”
 */
		Scanner input=new Scanner(System.in);
		System.out.println("Pleae enter your city.");
		String city=input.next();
		System.out.println("What is the temperature in your city?");
		int temp=input.nextInt();
		int tempCelcius=((temp-32)*5/9 );
		System.out.println("tempCelcius");
		System.out.println("The temperature in the city of"+city+" is "+tempCelcius);
		
		
	}

}
