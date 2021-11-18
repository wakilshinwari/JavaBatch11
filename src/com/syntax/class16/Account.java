package com.syntax.class16;

public class Account {

	String userName;
	private String password;
	private String name;
	private String address;
	private int age;
	private double accountBalance;

	public void setUsername(String AccountuserName) {

		if (AccountuserName.length() < 16) {

			userName = AccountuserName;

		} else {

			System.out.println("UserName of this length is not allowed");
		}

	}

	public void setPasword(String accountPassword) {

		if (accountPassword.length()<16) {
			System.out.println(accountBalance);
		} else {
			System.out.println("UserName or password is not correct");
		}
	}
}
