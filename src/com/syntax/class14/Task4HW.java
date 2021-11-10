package com.syntax.class14;

public class Task4HW {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).
		
		String str="Sunday";
		
		String newStr="";
		for (int i=str.length()-1; i>=0;i--) { //we use -1 becasue the index start with zero
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);

	}

}
