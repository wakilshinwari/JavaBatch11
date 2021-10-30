package com.syntaxreviewclass3;

public class IfElseDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Code before if else");
		
		if (10>50) {
			System.out.println("inside the if condition");
			
		}else {
			System.out.println("inside the else condition");
			System.out.println("inside the if condition");

		}
		System.out.println("Code after if else");
		
		System.out.println("***************");
		
		int num=30;
		if(num>10) {
			System.out.println("number is 10");
		}else if (num>30) {
			System.out.println("number is 20");
		}else if (num>20) {
			System.out.println("number is 30");
		}else {
			
			System.out.println("Unknown number");
		}
		System.out.println("***************");
	

	}
	

}

