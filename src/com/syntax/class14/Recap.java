package com.syntax.class14;

public class Recap {

	public static void main(String[] args) {

		// it counts the characters,size of the value
		String name = "Nasiri";
		System.out.println(name.length());
		// concat operators vs + operator. + operator is recommended
		// startsWith means if a word starts with that specific number--if it is, it is
		// true. I can look for space, chaaterers or numbers

		System.out.println(name.startsWith("N"));
		System.out.println(name.startsWith("A"));
		System.out.println(name.endsWith("r")); // it is canse sensitive R
		System.out.println(name.contains("a")); // if it is true, the word Nasir contains a
		System.out.println(name.equals("Nasir"));// equals = if the string has the same characters
		System.out.println(name.equalsIgnoreCase("NaSir"));// equalsIgnoreCase means it doenst descriminate about the
		System.out.println(name.charAt(4));// it returns the value of each index --0 1 2 3 4(Nasir) has four index.
		System.out.println(name.indexOf("i")); // it returns the index of a string ( Nasir) i is 3
		System.out.println(name.substring(3)); // Returns a string that is a substring of this string.
		// he substring begins with the character at the specified index and extends to
		// the end of this string.
		// "unhappy".substring(2) returns "happy"
		// "Harbison".substring(3) returns "bison"

		System.out.println("*************");
		System.out.println(name.substring(3, 6));

		System.out.println(name.isEmpty()); // //it Returns true if, and only if, length() is 0.

System.out.println(name.trim());

String sentence="This is a Java class";
System.out.println(sentence.split(" ").length);
System.out.println(sentence.split(" "));
	}

}
