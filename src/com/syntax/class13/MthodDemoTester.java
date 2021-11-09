package com.syntax.class13;

import java.util.Arrays;

public class MthodDemoTester {

	public static void main(String[] args) {
		// If we want you call this method--what do we need first? 
		//I need to create an object of this class
		
		MethodDemo obj=new MethodDemo(); //Object

		//obj.add(10, 10);
		//System.out.println(obj.add(10, 10));
		
		int[] array= {10,10,10};
		
		array=obj.doubleArray(array);
		
		System.out.println(Arrays.toString(array));
	}
}
