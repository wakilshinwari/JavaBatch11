package com.syntax.class10;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][]numbers= {
				
				{100,200,300},
				{9, 8, 7},
				
		};
			System.out.println("Size of 2D array ="+numbers.length);
		System.out.println(numbers[1][1]); //we get only one element 8 
		
		System.out.println("get all elements using enhanced for loop");
		
		//get all the element
		
		for (int[]nums:numbers) {
			
			for(int n:nums) {
				System.out.print(n+" ");
				
			}
			
			
			System.out.println("get all eelements using regular for loop");
			
			for (int i=0; i<numbers.length;i++) {
				for (int j=0; j<numbers[i].length;j++) {
					int element=numbers[i][j];
					System.out.print(element+" ");
				}
				System.out.println();
			}
		}
	}

}
