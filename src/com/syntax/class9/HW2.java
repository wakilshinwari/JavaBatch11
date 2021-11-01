package com.syntax.class9;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Apply for a credit card!");
			answer = scanner.nextLine();
		} while (answer.equalsIgnoreCase("No"));
		System.out.println("Thanks");
	}

	


}
