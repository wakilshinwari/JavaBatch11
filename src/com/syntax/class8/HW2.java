package com.syntax.class8;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*Ask user what he/she wants to buy, ask for price and to pay for an item.
		 * continue asking to pay until user gets a right amount.
         /*conditions:
          * if user gives extra money --> give change
          */
		/*if user gives less money --> ask how much more you need
		 * The amount has to be accumulated if users add more money
		 * Whenever a user is done with payments, tell them “Thank you for shopping!
		 */

		Scanner input = new Scanner(System.in);
		String item;
		double price;
		double money;
		double remainder;
		double sum=0;
		System.out.println(" Please enter the item you want to purchase");
		item=input.next();
		System.out.println(" Please enter the price");
		price=input.nextDouble();
		
		do { 
			System.out.println(" Please pay for the "+item);
			money=input.nextDouble();
			
			sum+=money;
			if (money>price) {
				double change=money-price;
				System.out.println("Here is your change"+change);
				break;
			}else if (money<price) {
				remainder=price-money;
				System.out.println("Please give me more"+remainder);
			}else {
				System.out.println("You go the right amount");
			}
			
		} while (sum!=price);
		
		System.out.println("Thank you for shopping");
	}
	
		
	}

