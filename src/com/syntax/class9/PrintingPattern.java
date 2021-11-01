package com.syntax.class9;

public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int r=1; r<=4; r++) {
			for (int c=1; c<=5; c++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("How to print a square 10x10");
		
		for (int r=1; r<=10; r++) {
			for (int c=1; c<=10; c++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
