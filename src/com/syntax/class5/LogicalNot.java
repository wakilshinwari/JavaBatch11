package com.syntax.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean boo=true;
		System.out.println(boo);
		
		boolean boo1=!true;
		System.out.println(boo1);
		
		boolean boo2=!false;
		System.out.println(boo2);
		
		System.out.println("***********");
		boolean isRaining=false;
		if ( !isRaining) {
			System.out.println(" I will go for a walk");
		}
		System.out.println("***********");
		
		String userName="Test";
		String passWord="Test";
		if (userName.equals(passWord));
		System.out.println("I am accepting your password");
		

		System.out.println("***********");
		boolean selected=true;
		if (!selected) {
			System.out.println("do click");
		}else {
			System.out.println("do not click");
		}
			
	} 

}
