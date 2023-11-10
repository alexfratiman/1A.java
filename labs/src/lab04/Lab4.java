package lab04;

import java.util.Scanner;

public class Lab4 {
	 
	 public void part1(Scanner scanner) {
		 System.out.println("Price of a bag please?");
		 int price = scanner.nextInt();
		 if(price <= 0) {
			 System.out.println("That's not a valid price.");
			 return;
		 }
		 System.out.println("How much money do you have?");
		 int money = scanner.nextInt();
		 if(money <= 0) {
			 System.out.println("You do not have enough funds to buy any bags.");
			 return;
		 }
		 int numBag = money / price;
		 System.out.println("If the price is " + price + "p and you have " + money + "p then you will be able to buy " + numBag + " bags."); 
	 }
}
