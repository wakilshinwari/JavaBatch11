package com.syntax.class4;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		String str="ABC";
		Scanner scan=new Scanner(System.in);
		String name=scan.next();  //it will capture string value from console
		System.out.println("Hello"+name);
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		System.out.println(name+"you are "+age+"years old");
	}

}
