package com.syntax.class15;

public class SyntaxStudentTester {

	public static void main(String[] args) {
		// let's create some objects
		SyntaxStudent Sorbon=new SyntaxStudent();
		
		Sorbon.name="Sorbon";
		Sorbon.id="123";
		Sorbon.calculateFee();
		System.out.println(Sorbon.school);
		System.out.println(SyntaxStudent.school);

	}

}
