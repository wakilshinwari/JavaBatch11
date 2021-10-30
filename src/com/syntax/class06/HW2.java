package com.syntax.class06;

public class HW2 {

	public static void main(String[] args) {

		   System.out.println("Please enter Quiz score");
		   Quizscore=scan.nextInt();
		    System.out.println("Please enter Midgrade score");
		    Midgrade=scan.nextInt();
		   System.out.println("Please enter Final score");
		   Finalscore=scan.nextInt();
			
			   average =(quizscore + midgrade + finalscore)/3;
			   
			   if(average >=90) {
				 grade='A';
				  
			 }else if (average >=70 && average < 90) {
				 grade='B';
				  
			 }else if (average >=50 && average < 70) {
				 grade='C';
				  
			 }else if (average <50) {
				 grade='F';
			 }else {
				 grade=('X');
			 }
				 System.out.println("Your grade is " +grade+" and your average is "+average);
	}

}
