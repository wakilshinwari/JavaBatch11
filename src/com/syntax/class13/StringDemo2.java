package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="";
		
		System.out.println(name.isEmpty());
		// if we can put something in this name
		name="Silva";
		System.out.println(name.isEmpty());
		
		//the next method is 
		
		String str="        Batch 11 is...      ";//i have spaces before and after string so I want to remove those spaces
		
		System.out.println(str.trim());
		
		//next method is  we check if somehting starts with 
		String str2="this is an easy class";
		System.out.println((str2.startsWith("T")));
		System.out.println(str2.startsWith("This"));
		System.out.println(str2.startsWith("L"));
		System.out.println(str2.startsWith(str2));
		//we can also check if something ends
		System.out.println(str2.endsWith("easy"));
		System.out.println(str2.endsWith("s"));
		
		
		
				
		
		
		
		
	}

}
