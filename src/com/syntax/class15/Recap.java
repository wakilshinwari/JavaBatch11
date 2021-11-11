package com.syntax.class15;

public class Recap {

	public static void main(String[] args) {

		String str="This is lubo. Lubo is break manager";
		
		System.out.println(str.replace("Lubo", "Sorbon"));
		
		System.out.println(str.replaceAll("Lubo", "Sorbon"));
		
		String str2="KajdfkjaSADB1234%^$#@";
		
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));
		
		System.out.println(str2.replace("[]^A-Za-z0-9", ""));
		
		//String str3=""; String is not recommeded because every time 
		//it will search the memory and that will slow down the code.
		
		//if you keep changing the string then you should use StringBuilder
		//upend means cancat
		
		StringBuilder stringBuilder= new StringBuilder();
		
		for (int i=0;i<5;i++) {
			stringBuilder.append(i);
			
		}
		System.out.println(stringBuilder);
		
		//if we want to convert this string to stringbuilder class
		
		String str4="Me: Look it's not you it's me";
				
		
		StringBuilder strBuilder=new StringBuilder(str4);
		
		strBuilder.reverse();
		System.out.println(strBuilder);
	}

}
