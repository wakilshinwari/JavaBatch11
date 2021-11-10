package com.syntax.class14;

public class StringDemo3 {

	public static void main(String[] args) {

		String str="ajfhjajffgsJDKJSKDFDJD142377349667!#$%^%^^&&";
			
		System.out.println(str.replaceAll("[0-5]", "*"));
		System.out.println(str.replaceAll("[a-z]", "*"));
		System.out.println(str.replaceAll("[A-Z]", "*"));
		System.out.println(str.replaceAll("[A-Za-z]", "*")); //if you want to replace all uper and lower casese or you 
		//you can cancat   System.out.println(str.replaceAll("[A-Z]", "*").replacAll("[a-z]", "*"));
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "*"));  //it is negating the expression it is a "not"
		
		System.out.println(str.replaceAll("[0-9]", ""));


				
	}

}
