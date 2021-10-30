package com.syntax.class4;

import java.util.Scanner;

public class HoweWork3 {

	public static void main(String[] args) {
		//You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver license to them, 
		//otherwise you will offer them to get a learners permit.

Scanner DMV=new Scanner(System.in);
System.out.println("How old are you?");
int age=DMV.nextInt();

if( age>=18) {
	System.out.println("Okay.We will issue a driver license.");
	
}else {
	System.out.println("We won't issue you a driver license");


}
	}

}
