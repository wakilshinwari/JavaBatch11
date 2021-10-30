package com.syntax.class3;

public class TypeCasting {

	public static void main(String[] args) {
		
		int number=10;
		double number2;
		number2=number; 
		System.out.println(number);
		
		double number3=10.5;
		int number1=10;
		number1=(int)number3;
		System.out.println(number1);
		
		int number5=10;
		double number6=number5;
		
		double num5=10;
		int num6=(int)num5;
		System.out.println(num6);
		
		int number7=1256;
		byte number8=(byte)number7;
		System.out.println(number8);  //results can be alarmingly different
		
		
				
		

	}

}
