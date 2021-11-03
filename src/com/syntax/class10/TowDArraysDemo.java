package com.syntax.class10;

public class TowDArraysDemo {

	public static void main(String[] args) {
		// This is the longer way
		//
		
		int [][] bigArray=new int[3][3];
		
		//adding elemtns inside first array or first row
	bigArray[0][0]=10;
	bigArray[0][1]=20;
	bigArray[0][2]=30;
	
	// adding elelments inside second array or second row
	
	bigArray[1][0]=1;
	bigArray[1][1]=2;
	bigArray[1][2]=3;
	
	// add element inside third array or third row
	bigArray[2][0]=100;
	bigArray[2][1]=200;
	bigArray[2][2]=300;
	
	//how t o access?
	System.out.println(bigArray[2][1]);   //200
	
	//What doese show?
	System.out.println("2nd aray size "+bigArray.length);
	}

}
