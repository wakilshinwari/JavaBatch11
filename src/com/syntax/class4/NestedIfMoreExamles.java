package com.syntax.class4;

public class NestedIfMoreExamles {

	public static void main(String[] args) {
		
		boolean replCompleted=true;
		int assignments=19;
		
		if (replCompleted) {
			
			if (assignments >16) {
				System.out.println("You did an amazing work");
			} else if(assignments >10) {
				System.out.println("You did good, but you should do more");
			} else if (assignments >6) {
				System.out.println("You need to try do more hw");
			} 
		}else {
			System.out.println("Please make sure you do your homework");
			
		}
	}
	

}

