package com.syntax.class5;

import java.util.Scanner;

public class HomeWork1Class5 {

	public static void main(String[] args) {

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Birthday");
		String month=scan.next();
		
		String season;
		
		if (month.equalsIgnoreCase("January")|| month.equalsIgnoreCase("February")||month.equalsIgnoreCase("March")) {
			season="Spring";
		}else if(month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")||month.equalsIgnoreCase("June")) {
			season="Summer";
		
		}else {
			season="Invalid";
			
		}
		System.out.println("You were born season is"+season);
	}

}
