package com.syntax.class06;

import java.util.Scanner;

public class HWork2 {

	public static void main(String[] args) {
		/*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
		 *  Based on operator provide the result to user.  
         * Please complete this assignment in 2 ways: using if statement and switch case.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		
		int c=scan.nextInt();
		int d=scan.nextInt();
		System.out.println("Please provide an operator (+,-,*,/)");
		char operator=scan.next().charAt(0);
		
		if (operator=='+') {
			System.out.println("The result will be "+(c+d));
		}else if (operator=='-') {
			System.out.println("The result will be "+(c-d));
		}else if (operator=='*') {
			System.out.println("The resulte will be "+c*d);
		}else if (operator=='/') {
			System.out.println("The result will be "+(c/d));
		}else {
			System.out.println("Invalid operator");
		}
		
		//Switch Statement 
		
	
		String calculator;
		
		switch (operator) {
		case '+':
			calculator ="The result will be "+(c+d);
		break;
		case '-':
			calculator ="The result will be "+(c-d);
			break;
		case '*':
			calculator ="The result will be "+(c*d);
			break;
		case '/':
			calculator ="The result will be "+(c/d);
			break;
			default:
				calculator="Invalid operator";
		}
		System.out.println("calculator");
	}

}
