package com.syntax.class9;

public class ALLfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] num= {100, 200, 300,400,500};

		
		
		for (int i=0; i<num.length; i++) {
			
			System.out.print(num[i]+" ");
		}
		
		//to access all elements from any array//advanced for loop/enhanced
		
		for (int n:num) {
			System.out.println(n);
		}
		
		
	}

}
