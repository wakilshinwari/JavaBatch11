package com.syntax.class8;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<=10; i++) {
			
			System.out.println("Almost done");
			break;
		}
		
		System.out.println("____________-________*************");
		
for (int i=0; i<=10; i++) {
			
			System.out.println("Almost done");
	if (i==3) {
		System.out.println("About to break the loop");
		break;
	}
		
	}
System.out.println("____________-________*************");

boolean summer=true;
int temp=75;

while (summer) {
	
	System.out.println(" Iam happy, I love summer");
	
	if (temp<=100) {
		System.out.println("I dont love summer anymore");
		break;
	}
	
	temp+=5;
}
	}

}
