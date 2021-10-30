package com.syntax.class7;

public class ForLoopIntro {

	public static void main(String[] args) {
		/* initialization 
		 * condition 
		 * increment/decrement
		 * 
		 * 
		 */

		for (int i=1;  i <=5;  i++) {
			System.out.println(" Hello");
		}
		System.out.println("Print numbers from 1 to 20");
		/* start point 
		 * end point 
		 * increment /decrement
		 * 
		 */
		
		for (int i=1; i<=20; i++) {
			
			System.out.print(i+" ");
		}
		
		System.out.println("Print numbers from 100 to 20");

		for (int i=100; i>=20; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println("Print even numbers from 1 to 50");
		
		int i=1;
		for (i=1;  i<=50; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("Print even numbers from 1 to 50");
        for(int i=2; i<=50; i+=2) {
	
	System.out.println(i+" ");
}
		
	}
	

}
