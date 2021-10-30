package com.syntax.class06;

import java.util.Scanner;

public class TaskSwitchStatements {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 * 
		 * 
		 * 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.next();
		String langauge;
		
		switch (country) {
		case "Afghanistan":
		langauge="Pashto";
		break;
		
		case "USA":
			langauge="English";
			break;
		case "India":
			langauge="Hindi";
			break;
			default:
			langauge="Unknown";
			break;
		}
	System.out.println("If your homecounty is "+country+ ", you speak "+langauge);
	}

}
