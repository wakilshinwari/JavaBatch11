package com.syntax.class14;

public class HWTask1Practice {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY
		 */
		String fathersName="Daniel";  //6 is divide by 2 
		String mothersName="Mary";
		String isBoyGirl="Boy";
		
		if (isBoyGirl.equalsIgnoreCase("Boy")){
			String firstPart=fathersName.substring(0, fathersName.length()/2);
			String secondPart=mothersName.substring(mothersName.length()/2);
			
			System.out.println(firstPart+secondPart);
			
		}else {
			String firstPart=mothersName.substring(0,fathersName.length()/2);
			String secondPart=fathersName.substring(mothersName.length()/2);
			System.out.println(firstPart+secondPart);
			System.out.println(firstPart+secondPart);
		}

	}

}
