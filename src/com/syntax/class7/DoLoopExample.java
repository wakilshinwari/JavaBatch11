package com.syntax.class7;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		/* lets create a secret number (1-100)
		 * 
		 * let ask your user to goes my secret number 
		 * keep asking for a number till user guess the secret number
		 * 
		 */
		
		int secretNumber=78;
		Scanner scan=new Scanner(System.in);
		int userNumber;
        do {
        	System.out.println("Please guess my secret number. It is a number from 1 - 100.");
        	userNumber=scan.nextInt();
        	
        }while (userNumber!=secretNumber); 
        System.out.println("you got it");
	}

}
