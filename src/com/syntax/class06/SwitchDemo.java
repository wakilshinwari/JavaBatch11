package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		char gender='m';
		String description;
		switch (gender) {
		
		// values in cases must be the same data type as variable in switch 
		//we cannot have duplicates
		// 
		
		case 'm':
			description="Male";
			break;
		case 'f':
			description="Female";
			break;
			default:
				description="Unknown";
				
				
		
		}
		System.out.println(gender+" means "+description);
		
		//limitations ******  1. WE cannot use logical operators with SWTICH CASE
		// we cannot use relational operators 
		//only only if you are looking for equality then you can use 
		
		// WE can alwasywith String, char and int
		//limitations of data type
		/*
		 * 1. cannot use boolean 
		 * 2. cannot use with double/float
		 * 3. cannot use with long
		 */
		
		
			
	}

}
