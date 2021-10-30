package com.syntax.class5;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter today's day");
		String day=scan.next();
		
		if (day.equals(("Monday")) || day.equals ("Friday")) {
			
		}else if (day.equals(("Tuesday")) || day.equals ("Wednesday")) {
			System.out.println("I have a manual class");
		}else if (day.equals(("Th")) || day.equals ("Friday")) {
		
	}

}
