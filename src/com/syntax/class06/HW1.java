package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
	
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month=in.next();
		
		
		String season;
		
		if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("March"))	{
			season="Spring";
		} else if(month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("june")) {
			season="Summer";
		} else if(month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august") || month.equalsIgnoreCase("september")) {
			season="Fall";
		} else if(month.equalsIgnoreCase("october") || month.equalsIgnoreCase("november") || month.equalsIgnoreCase("december")) {
			season="Winter";
		} else {
			season="Invalid";
		}
		System.out.println("You were born season is "+season);
}
	}
