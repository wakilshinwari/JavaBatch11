package com.syntax.class4;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an intem you want to buy");
		
		String item=input.next();
		System.out.println("Please enter the price of the "+item);
		
		double price=input.nextDouble();
		System.out.println("You selected"+item+"with price="+price);
		
	}

}
