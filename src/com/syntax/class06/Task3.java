package com.syntax.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		String country=Scan.next();
		String language=null;
		
		switch(country.toLowerCase()) {
		case "usa":
		case "England":
		case "Australia":
			language="english";
			break;
		case "mixico":
			language="spanish";
			break;
		case "tunisia":
			language="arabic";
			break;
		case "france":
			language="french";
			break;
		case "katar":
			language="Arabic";
			break;
			default:
				language="unknown";
		}
		if	(!language.equals("unknown")) {
			System.out.println("Your country is "+country+" and your language is "+language);
	}else {
		System.out.println("Please try another country");

	}
	}
}
