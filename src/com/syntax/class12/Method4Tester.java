package com.syntax.class12;

public class Method4Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method4 canBeAnyName = new Method4();

		// value from method1 will be store in name variable
		String name = canBeAnyName.method1();
		System.out.println(name);

		System.out.println(canBeAnyName.method2("Roman"));
		// System.out.println(canBeAnyName.method3());not possbile because void cannot
		// be returned
		canBeAnyName.method4("Nasir");
		canBeAnyName.method5("Henok");
		System.out.println(canBeAnyName.method5("Henok") );
	}

}
