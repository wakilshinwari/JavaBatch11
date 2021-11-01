package com.syntax.class01;

public class DataTypes {

	public static void main(String[] args) {

		// representing and storing whole numbers
		byte box1 = 127; // range from -128 till 127
		short box2 = 32767; // range from to 32767
		int box3 = 100000; // most popular data types to use for whole numbers
		long box4 = 990000000000000L; // we can use L to accept big numbers

		// representing and storing decimal numbers
		float a = 1.99f; // we have to add f to represent" f " a is the variable name. 5 to 6 decimal
							// places
		double b = 19.99; // double gives 14 to 15 places of accuracy. it is the most popular we use if by
							// default

		// representing and storing single character
		char character = '#'; // if you want to store one character
		char letter = 'C'; // if you want to store a lettter

		// representing and storing boolean values ( yes or no ) true or false
		boolean hungry = true; // yes
		boolean tired = false; // no

		System.out.println(box1);
		System.out.println("box1");     //it will print the name of the variables 
		//System.out.println(box); access only variables tht you created
	}

}
