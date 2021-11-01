package com.syntax.class9;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		/*Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: 
		 * “Saturday is Java coding Day”.String [] day=new String[];
		 */
		
		
		String[] day=new String[5];
		
		day [0]="Java";
		day [1]="Saturday";
		day [2]="day";
		day [3]="coding";
		day [4]="is";
		System.out.println(day[1]+" "+day[4]+" "+day[0]+" "+day[3]+" "+day[2]);
		//
		// 2 way 
		String [] words= {"java", "Saturday", "day", "coding", "is", "love", "happy"};
		//we can use loop 
		//for or while---for when we know the number
		//while when we don lknow
		
		for (int i=0; i<words.length; i++) {
			
			System.out.println(words[i]);
			
		}
				
	}

}
