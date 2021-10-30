package com.syntax.class4;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*You are a loan specialist and you need to ask user 
		 * what is the amount of loan is needed.
		 *  If loan is less or equal to 200,000 then you would lend the money 
		 * otherwise you would reject the client.
		 */
		
		Scanner loan=new Scanner(System.in);
		System.out.println("What is the amount of loan you need?");
		int amount=loan.nextInt();
		
		
		if (amount<=200000){
			System.out.println("we can get you the requested loan.");
		}else {
			System.out.println("Your loan request will be rejected");
		}
	
	}

}
