package com.syntaxreviewclass3;

public class NestedIfelsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int number=10;
		boolean isTrue=true;
		double number2=20;
		
		if ( number>5) {
			if(isTrue) {
				if(number2==30) {
					System.out.println("1");
				}else {
					System.out.println("2");
				}
				if (true) {
					System.out.println("5");
				}
			}else {
				if (number2==20) {
					System.out.println("4");
				}
			}
			
		}
	}

}
