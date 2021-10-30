package com.syntax.class7;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// I want to ask a user thier name adn age 5 times
		
		
				Scanner scan=new Scanner(System.in);
				
				int i=1;
				while (i<=5) {
					 
				 
				System.out.println("Please enter your name and age");
				
			String name=scan.next();
			int age=scan.nextInt();
			
			System.out.println("Your name is "+name+" and your "+age+" years old ");
			
			i++;
	}

}
}