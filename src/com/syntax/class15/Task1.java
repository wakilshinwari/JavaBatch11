package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		
		String str="Me: Look it's not you it's me";
		
		System.out.println(str.replaceAll(" ", ""));
		
		System.out.println(str);   //the string is immutable and cannot be changed.we can use it as long as we reassign it.
		//we use StringBuilder because it is mutable. if bring any changes to the express or code it will reflect it ont the console
		
		StringBuilder str2=new StringBuilder("Me: Look it's not you it's me");
		System.out.println(str2.reverse());
		System.out.println(str2);
		
		
	}

}
