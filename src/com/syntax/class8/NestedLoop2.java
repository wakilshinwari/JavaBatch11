package com.syntax.class8;

public class NestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for (int i=1; i<=9; i++) {    //outer loop
			
			
			for (int j=1; j<=9; j++) {  // inner loop
				System.out.println(i+" "+j);
				
			}
		}
		System.out.println("Car Odometer");
		
         for (int a=0; a<=9; a++) {    
		  for (int b=0;b<=9; b++) {  
			
				for (int c=0; c<=9; c++) {
					for (int d=0; d<=9; d++) {
						System.out.println(a+""+b+""+c+""+d);
					}
				}
					
				}
				
	}
     	System.out.println("Multiplication");
     	
	for (int i=1; i<=10; i++) {    
			
			for (int j=1; j<=10; j++) {  
				
				
				System.out.println(i+"*"+j+"="+i*j);
}
			System.out.println("*******************");
		
}
	
	
	System.out.println("*******************");
	
	
	for (int i=00; i<24; i++) {
		for (int b=00; b<=59; b++) {
			System.out.println(i+":"+b);
		}
	}
	}
}
