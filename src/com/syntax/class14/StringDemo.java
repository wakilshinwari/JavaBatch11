package com.syntax.class14;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// 
		
		String str="Today is Tuesday? Today we have java class.";
		
		String[]strArr=str.split("[?]"); // it splits the sentence based on any that charater, number or anything 
		//
		
		
		for (String s:strArr) {
			System.out.println(s);
		}
		
		

	}

}
