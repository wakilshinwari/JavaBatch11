package com.syntax.class10;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {
		// lets create an 2D array of groceries
		
		String [][] groceries= {
				{"banana","apple",",mango"},   // index 0
				{"potato","tomato"},        // index 1
				{"milk","cheese","ayran","yogurt"}  //index 2
			
	               	};

	    				System.out.println(groceries.length);
	    				// i want to print yogurt
	    				
	    				System.out.println(groceries[2][3]);
	    				
	    				//i want to find how many elements my first array has.
	    				
	    				System.out.println("num of elements inside 1 array with index 0="+groceries[0].length);
	    				System.out.println("num of elements inside 2 array with index 0="+groceries[1].length);
	    				System.out.println("num of elements inside 3 array with index 0="+groceries[2].length);
	    				
	    				
	    				//how do we get all elements from 2D array ????? we are going to use for loops
	    				
	    				for (int i=0; i<groceries.length; i++) {    //iterates over arrays  or rows
	    					for (int j=0; j<groceries[i].length; j++) {// iterates over elemnts of each single array or columns
	    						
	    						System.out.print(groceries[i][j]+" ");
	    						
	    					}
	    					System.out.println();
	    				}
	    				
	    				
			

	};

}
