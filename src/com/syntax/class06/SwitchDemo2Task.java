package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2Task {

	public static void main(String[] args) {
		//we can use toLowerCase() or toUpperCase to ensure we print lower case or upper case words

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a country");
		
		String country=scan.nextLine();
		String food;
		
		switch (country) {
		case ("Afghanistan"):
			food ="Palaw";
		break;
		case ("USA"):
			food= "Fastfood";
			break;
		case ("Italy"):
			food="Pasta";
		default:
			food="Unknown";
			
		}
		System.out.println("In "+country+"the food is "+food);
	}

}
	
