package com.syntax.class16;

public class RecapTester {

	public static void main(String[] args) {
		// the default is 0 for int if it is not initailized 
		// the varialbe adn we have not assinge an value

		
		Recap recap=new Recap();  //we are decaling an object
		recap.number=10; //we are acccinssong the varialbe
		
		recap.setConstantNumber();
		recap.setNumber(50);
		recap.printNumber();
		
		Recap recap2=new Recap();
		
		recap2.printNumber();
		
		//what can we do to change 50 to 0 so we change public to static 
		//
		
		
		
	
		
	}

}
