package com.syntax.reviewclass6;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1=new Student();
		
		s1.name="Olga";
		s1.gender= "Female";
		s1.course="SDET";
		s1.division="first";
		
		s1.sleep();
		s1.study();
		s1.studentInformation();
		
		Student s2=new Student();

		s2.name="Sebastian";
		s2.gender= "Male";
		s2.course="Java";
		s2.division="second";
		
		s2.sleep();
		s2.study();
		s2.studentInformation();
		
		
	}

}
