package com.syntax.class8;

public class NestedLoops {

	public static void main(String[] args) {
		/* nestloops ..... loops inside another loop
		 * 
		 */

		for (int i=1; i<=3; i++) {    //outer loop
			System.out.println(" I am an outer loop");
			
			for (int j=1; j<=4; j++) {  // inner loop
				System.out.println("I am inner loop");
				
			}
		}
		System.out.println("End of the code");
	}



}


