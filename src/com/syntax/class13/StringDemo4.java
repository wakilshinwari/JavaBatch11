package com.syntax.class13;

public class StringDemo4 {

	public static void main(String[] args) {
		//
		//this how you get indviddule words from a senetecnce 

		String str="This is Batch 11 Batch 11 is great";
		
		String [] arr=str.split(" ");
		
		for (String word:arr) {
			System.out.println(word);
		}
	}

}
