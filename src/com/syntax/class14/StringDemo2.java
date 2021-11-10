package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		// I have this I want to change many things 
		
		String str="This is Batch 11 Batch 11 is good";
		
		System.out.println(str.replace("good", "Great")); //that spericifi thing will replace with the new string
		str="This is Batch 11 Batch 11 is good";
		System.out.println(str.replace("good", "Great").replace("Batch", "Not Batch"));//you can repalce two words at the same time
         System.out.println(str.replaceFirst("good", "Great"));
	}

}
