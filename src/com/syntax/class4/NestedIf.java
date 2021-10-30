package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine=true;
	    int does=2;
		if (vaccine) {
			System.out.println("How many doese have taken");
			
			if (does==1) {
				System.out.println("When are you taking your 2nd does?");
				
			}else {
				System.out.println("You are fully vaccinated");
				
			}
		}
		
		System.out.println("******************");
		
		String day ="Friday";
		int date=13;
		
		if (day.equals("Friday")){
			
			System.out.println("I am going to the movies today");
			
			if (date==13) {
				System.out.println("I am watching a scary movie");
			}
			
		}else {
			System.out.println("I am goingto study");
			
		}
		
	}

}
