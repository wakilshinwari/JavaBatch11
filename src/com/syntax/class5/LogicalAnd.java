package com.syntax.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		//we want to test two conditions with && ( logical oeprator

		boolean understandJava=true;
		boolean enjoyJava=true;

		
		if ( understandJava && enjoyJava) {
			System.out.println("That is awesome");
		}else {
			System.out.println("You probably need to study more");
		
		}
		System.out.println("****************");
		
		boolean understandJava1=true;
		boolean enjoyJava1=false;

		
		if ( understandJava1 && enjoyJava1) {
			System.out.println("That is awesome");
		}else {
			System.out.println("You probably need to study more");
		
	}
		System.out.println("****************");

		/* ask a user to enter a number
		 * based on the entered number we will define if number is small medium or large
		 * if number is between 1 and 10 -----small
		 * if number is between 11 and 100 ---- medium
		 * if number is between 101 and 1000 ---- large
		 * if number is more 1001 ---it is extra large
		 */
		Scanner in=new Scanner (System.in);
		System.out.println("Please enter any number");
		int num=in.nextInt();
		
		if ( num<1) {
			System.out.println("Number is 0 or negative");
		}
		
		if (num>1&&num<10) {
			System.out.println(num+"is small");
		}else if (num>=11 && num<=100) {
			System.out.println(num+"is medium");
		}else if (num>=101 && num<=1000) {
			System.out.println(num+"is large");
			
		}else if (num>=1001) {
			
			System.out.println(num+"s extra large");
		}
				
		
	}
}
