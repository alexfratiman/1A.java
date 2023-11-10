package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Price of a bag please?");
		int price = scanner.nextInt();
		System.out.println("How much money do you have?");
		int money = scanner.nextInt();
		int numBag = money / price;
		System.out.println("If the price is " + price + "p and you have " + money + "p then you will be able to buy " + numBag + " bags."); 
		scanner.close();
	}		 
		}


	
