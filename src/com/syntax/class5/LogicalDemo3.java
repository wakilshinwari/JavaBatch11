package com.syntax.class5;

import java.util.Scanner;

public class LogicalDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter 3 numbers");
		
		double num1= scan.nextDouble();
		double num2= scan.nextDouble();
		double num3= scan.nextDouble();
		
		if (num1==num2 && num1 ==num3) {
			System.out.println("Numbers are equal");
		}else {
			
		}
	}

}
