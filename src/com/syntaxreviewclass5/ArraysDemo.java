package com.syntaxreviewclass5;

public class ArraysDemo {

	public static void main(String[] args) {
		// if we want to stor one value we varialbes
		String name11= "Abdul";
		
		
		// if we have to stro multiple values os the same type we should use arrays 
 String []names;
 names=new String[5];
 names[0]="Moe";
 System.out.println(names[0]);
 names [1]="mohammad";
 System.out.println(names [1]);
 
 
 names [2]="Henok";
 names [3]="Priyanka";
 names [4]="Priya";
 
 //System.out.println(names[5]);   array index out of bound
 
 System.out.println(names.length);
 System.out.println("********************");
 // we use regular For here 
 
 for (int i=0; i<names.length;i++) {
	 System.out.println(names[i]);
 }
 //we use enhanced loop here too  
 System.out.println("********************");
 for (String name:names) {
	 System.out.println(name);
 }
 System.out.println("********************");

 //we use while loop here
 
 int i=0;
 while (i<names.length) {
	 System.out.println(names[i]);
	 i++;
	 
 }
 
 
	}

}
