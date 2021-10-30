package com.syntaxreviewclass3;

public class SwitchCasesIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month=2;
		
		if (month==2) {
			System.out.println("Jan");
			
		}else if (month==2) {
			System.out.println("Feb");
		}else if (month==3) {
			System.out.println("Mar");
		}
		
		//switch case is the replacement of if statements
		//the shorter way to write System.out.println() is to write the name of varible + the value
		//month="Jan"
		
		switch (month) {
		case 1:
		System.out.println("Jan");
		case 2: 
			System.out.println("Feb");
		case 3:
			System.out.println("Mar");
	} 
	
	
	}

}
