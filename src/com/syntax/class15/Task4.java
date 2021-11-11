package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?
		
		String str="This is sentence I want to reverse";
		
		String []strArr=str.split(" ");
		
		for (String word:strArr) {
			
			StringBuilder stringBuilder=new StringBuilder (word);
			System.out.print(stringBuilder.reverse()+" ");
		}

		

	}

}
