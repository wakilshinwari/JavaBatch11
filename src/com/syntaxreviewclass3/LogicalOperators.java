package com.syntaxreviewclass3;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Sat";
		if(day.equals("Sat")) {
			System.out.println("It is weekend");
		}else if (day.equals("Sun")) {
			System.out.println("It is weekend ");
		}else {
			System.out.println("it is week day");
		}

	if (day.equals("Sun")||day.equals("Sat")) {
		System.out.println("it is weekend");
	}else {
		System.out.println("it is week day");
	}
}
}