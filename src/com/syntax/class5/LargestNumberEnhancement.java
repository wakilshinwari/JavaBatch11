package com.syntax.class5;

import java.util.Scanner;

public class LargestNumberEnhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in=new Scanner (System.in);
		System.out.println("Pleae enter current time");
		int time=in.nextInt();
		if (time>=1 && time <=11){
			System.out.println("Right now is morning");
			
		}else if ((time>=12 && time<=15)) {
			System.out.println("Right now is afternoon");
		}else if ((time>=16 && time<=20)) {
			System.out.println("Right now is evening");
		
	}else if ((time>=21 && time<=24)) {
		System.out.println("Right now is night");
	}else {
		System.out.println("Not valid time entered");
	}
		System.out.println("*******************");
		
		String timeOfDay;
		if (time>=1 && time<=11) {
			timeOfDay="morning";
		
		}else if (time>=12 && time <=15) {
			timeOfDay="afternoon";
			
		}else if (time>=16 && time <=20) {
			timeOfDay="evening";
	}else {
		timeOfDay = "Invalid";
	}
		System.out.println("right now is"+timeOfDay);
}
}