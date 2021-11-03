package com.syntax.class10;

public class AllElementsFrom2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String [][] groceries= {
				//we have three elements 
				{"banana","apple",",mango"},   // index 0
				{"potato","tomato"},        // index    1
				{"milk","cheese","ayran","yogurt"}  //index 2
			
	               	};
		
		for (String[] grocery:groceries) {
			for(String g:grocery) {
				System.out.println(g+" ");
			}
			System.out.println();
		}

	}

}
