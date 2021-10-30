package com.syntax.class8;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=5; i++) {
			
			if (i==3) {
				
				continue;
				
			}
			System.out.println("Hi "+i);
			System.out.println("Hello "+i);
		}
		System.out.println("End of the code");
	
	
		System.out.println("((*******(888**((((((((***********");

 

// i want to print numbers from 1 to 10 except number 3, 7 and 9
	for (int i=1; i<=10; i++) {
		
		if (i==3 || i==7 || i==9){
			
			continue;
			
		}
		System.out.print(i+" ");
	}
	System.out.println("End of the code");

}
	}
	
