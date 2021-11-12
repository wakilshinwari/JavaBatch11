package com.syntax.reviewclass6;

public class MethodClass {
	
	int i= 10;      //it is a instance variable

	//we are creating a method
	void welcomeBatch11(){
		//we create a statement
		System.out.println("Batch 11 has imense potential");
	}
	//we write methods
	void printMultipleEntities() {
		
		for (int i=0; i<10; i++);
		System.out.println(i);
		//this method will return 9 times
	}

	void takeArguments(String name) {
		
		System.out.println(name + "is a bright student");
	}
	void studentRecord(String name, int id, String course, String division) {
System.out.println(name + "is having the id number"+ id+ "enrolled for the course "+
	id+ " and secured"+ division+ "division in last exams");
}
	
	void checkBoolean(boolean isStudentStudy) {
		
		if (isStudentStudy) {
			
			System.out.println("Student will get a job for sure");
		}else {
			System.out.println("Student will join batch 12 as well");
		}
	}
}
