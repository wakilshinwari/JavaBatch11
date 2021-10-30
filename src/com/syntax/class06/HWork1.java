package com.syntax.class06;

public class HWork1 {

	public static void main(String[] args) {

		
		/*Print numbers from 1 to 100 in 1 line with space
Print numbers from 100 to 1
Print even numbers from 20 to 100 
Print only odd numbers from 100 to 1
		 */
		System.out.println("Print numbers from 1 to 100 in 1 line with space");
		int num=1;
		while ( num <= 100) {
			System.out.print( num + " " );
			num++ ;
		}
		
		System.out.println("Print numbers from 100 to 1");
		
		int i=100;
		while (i>=1) {
			System.out.println(i);
			i--;
				
	
		}
		System.out.println("Print even numbers from 20 to 100 ");
		
		int	e=20;
		while (e<=100) {
			e+=20;
			System.out.println(e);
	}
		System.out.println("Print only odd numbers from 100 to 1");	
		int odd=100;
		while (odd>=1) {
			
			odd-=3;
			System.out.println(odd);
			
		}

	
}
}
