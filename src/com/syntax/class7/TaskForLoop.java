package com.syntax.class7;

public class TaskForLoop {

	public static void main(String[] args) {
		/*Print numbers from 1 to 100 in 1 line with space
		 * Print numbers from 100 to 1
		 * Print even numbers from 20 to 1 (2 ways
		 * Print odd numbers between 20 and 50 (2 ways)
		 */

		int i=1;
		for (i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Print numbers from 100 to ");
		
		int j=100;
		for (j=100; j>=1; j-- ) {
			System.out.print(j);
		}
		
System.out.println("Print numbers from 20 to 1 ");
		
		int k=20;
		for (k=20; k>=1; k--) {
			if (k%2 !=0) {
				
			}
			System.out.println(k+" ");
		}
		System.out.println("Print numbers from 20 to 1 ");

	int l=20;
	
		for (int l1=20; l<=50; l++) {
			if (l%2==0) {
				System.out.print(l);
			}
		}
	}

}
