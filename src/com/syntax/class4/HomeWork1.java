package com.syntax.class4;

import java.util.Scanner;

public class HomeWork1 {


	public static void main(String[] args) {
		//Create a Java program to capture 2 numbers from a user and define which number is the largest.
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("number 1");
		int num1=scan.nextInt();
		
		System.out.println("number 2");
		 int num2=scan.nextInt();

		if(num1>num2) {
			System.out.println(num1+"is greater than"+num2);
		}else{
			System.out.println(num2+"less than"+num1);
		}
		
		
	}

}
