package com.syntax.class17;

public class Country {
	
	//Write a java class that will have a constructor: one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors 1 by 1.
	

	String name;
	String population;
	String continent;
	String language;
	
	public Country() {
		System.out.println("0 constructor ");
	}
	
	public Country(String name, String population, String continent, String langauge) {
		
		this.name = name;
		this.population = population;
		this.continent = continent;
		this.language = language;
	}
	void printName() {
		System.out.println("name "+name+ "population "+population+ "continent "+continent+"l anguage"+language);
	}
	
	
	
}

