package com.syntax.reviewclass6;

public class CatTester {

	public static void main(String[] args) {
		// in order to write the state of this class we need to create an object

		Cat c = new Cat();
		c.name = "Bob";
		c.breed = "persian";
		c.color = "white";
		c.age = 2;
		c.wieght = 6;

		System.out.println("My cat name is: " + c.name);

		System.out.println("My cat belongs to " + c.breed  +" sciety ");
		System.out.println("My cat's color is " + c.color);

		Cat c2 = new Cat();
		
		c2.name = "brisk";
		c2.breed = "siberian";
		c2.color = "black";
		c2.age = 3;

		System.out.println("My cat name is: " + c2.name);

		System.out.println("My cat belongs to " + c2.breed +" sciety ");
		System.out.println("My cat's color is " + c2.color);

	}

}
