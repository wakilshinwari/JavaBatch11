package com.syntax.class2;

public class ShortHandOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;
		number = number + 1;
		System.out.println(number);
		number++; // the value will be incremeted by 1 both are correct
		// this is the shorter way of this number=number+1;
		System.out.println(number);

		System.out.println("**********");
		number = 10;
		number = number + 30;
		System.out.println(number);
		number += 30; // number=number+30;

		System.out.println(number);

		number -= 30;
		System.out.println(number);

		System.out.println("**********");
		number = 10;
		number *= 30;
		System.out.println(number);

		System.out.println("**********");
		number = 10;
		number /= 30;

		System.out.println(number);

		System.out.println("**********");

		number = 10;
		number %= 5;
		System.out.println(number);

	}

}
