package com.syntax.class7;

public class MoreForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//what is the output
		int sum=0;
		
		for (int i=1; i<=6; i++) {
			sum+=i;
			System.out.println(sum);
		}
		
		int result=1;
		for (int i=1; i<=4; i+=2) {
			
			result*=i;
		}
		System.out.println(result);
	}

}
