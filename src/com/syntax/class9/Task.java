package com.syntax.class9;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] grades=new char [6];
		
		grades [0] ='A'; 
		grades [1] ='B'; 
		grades [2] ='C'; 
		grades [3] ='D'; 
		grades [4] ='E'; 
		grades [5] ='F'; 
		System.out.println(grades[1]);
		
		//second way creating an array
		
			System.out.println("**********************");
			
		char[] gradesArray={'A','B','C','D'};
			
		
			System.out.println(gradesArray.length);
		System.out.println("Element with index 2 is"+gradesArray[2]);
		
		String[]names= {"Ole", "Mehmet", "Elija", "Naya"};
		
		names [0]="Priya";  // replacing element with index
		
		System.out.println("After change value is "+names[0]);
		
		
		System.out.println("************");
 	
		String [] cars= {};
		System.out.println(cars.length);
		String []carrs=new String[3];
		
	}
		
	
		



}

