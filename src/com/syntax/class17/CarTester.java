package com.syntax.class17;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car=new Car ("Tesla model","Tesla","Model Y","Black", 2018, -1, 0, "123",-1,300,true);
		
		car.printName();
		
		Car car2=new Car ("Tesla model x");
		car2.printName();
		Car car3=new Car();
		car3.sayHello();
		}
	}


