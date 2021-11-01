package com.syntax.class9;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		
		System.out.println(num);
		
		System.out.println("------------------------");
		
		int[] array=new int[4];
		array[0]=12;
		array[1]=13;
		array[2]=14;
		array[3]=15;
System.out.println(array[2]+array[0]);
System.out.println(array[3]);

// I need to create an array that will hold 3 element of double type of values

           double []arr=new double [3];  //we are storing three elements inside an array taht we named arr
           arr [0]=11.99;
           arr [1]=1.09;
           arr [2]=3.08;
           
           //can we replace a value from an array?  Yes we can re assign it.
           arr [1]=100.99;
           System.out.println("After changing value of an element"+arr[1]);
           
           // i want to create an array that will store 4 colors
           
           String [] colors=new String[4];
           
         
           colors [1]="Blue";
           colors [2]="Black";
           colors [3]="Yellow";
       
           
           // see how many elements inside array/what is the size of any array
           
           System.out.println("Size of arra is"+colors.length);
             System.out.println(colors[0]);  //null
             
             
             
	}

}
