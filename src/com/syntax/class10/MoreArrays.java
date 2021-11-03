package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                       // 0   1    2    3    4
		char[] grades= {'A', 'D', 'A', 'B', 'C'};
		
		for (char grade:grades) {
			System.out.println(grade);
			
		}
		
		//how to print them in reverse way
		                //5-4
		for (int i=grades.length-1; i>=0; i--) {
			
			System.out.print(grades[i]+" ");
			
		}
	}

}
