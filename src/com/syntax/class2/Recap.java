package com.syntax.class2;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1="Hello world";
		int number1=10;
		String result=var1+number1;
		
		System.out.println(result);
		//we can combine any value wit String== as long as on of the variable is String
		boolean isTrue=true;
		System.out.println(isTrue+result);
		
		
		System.out.println("*********");
		
		int number2=14;
		int number3=3;
		
		System.out.println(number2/number3);
		System.out.println(number2%number3);
		
		int var6=100;
		var6++;
		System.out.println(var6); 
		
		int var7=100;
		var7--;
		System.out.println(var7);
		
		// number** is not allowed 
		//number// is not allowed
		double number8=20;
		number8+=10;
		System.out.println(number8);
		
		System.out.println("*********");

		number8-=20;
		System.out.println(number8);
		
		
		
		
		
	}

}
