package com.syntax.class5;

import java.util.Scanner;

public class LogicalOrDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner scan=new Scanner(System.in);
       System.out.println("Please enter your heights in inches");
       int height =scan.nextInt();
       
       if (height <60) {
    	   System.out.println("short");
    	   
       }else if (height>=60 && height<72) {
    	   System.out.println("Medium height");
       }else {
    	   System.out.println("Tall height");
       }


	}

}
