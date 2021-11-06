package com.syntax.class12;

public class Methods2 {
// let us build a behavior

	void repeatWords(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}

	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("Please take umbrella");
		} else {
			System.out.println("Let's go for a walk");
		}
	}
	void advanceMethod(Phone phone) {
		System.out.println();
	}
}