package lab06;

import java.util.Scanner;

public class Lab6 {
	
	public static int getInt(String prompt, Scanner scanner){
        System.out.println(prompt);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result; 
    }
	
	public static String getString(String prompt, Scanner scanner){
        System.out.println(prompt);
        String result = scanner.nextLine();
        return result;
    }
	
	public void part1(Scanner scanner) {
		String [] names = new String[5];
		int [] marks = new int[5];
		for(int i = 0; i < 5; i++) {
			names[i] = getString("What is your name?", scanner);
			marks[i] = getInt("Please input your grade from 1-100", scanner);
		}
		for(int i = 0; i < 5; i++) {
			 String grade = null;
			 if((marks[i] < 1) || (marks[i] > 100)) {
				 System.out.println("Error: marks must be between 1..100");
			 } 
			 else if(marks[i] < 50) {
				 grade = "Fail";
			 }
			 else if(marks[i] >= 50 && marks[i] <= 60) {
				 grade = "Pass";
			 }
			 else if(marks[i] >= 61 && marks[i] <= 70) {
				 grade = "Merit";
			 }
			 else if(marks[i] >= 71) {
				 grade = "Distinction";
			 }
			 System.out.printf("%s has a mark of %d and a grade of %s.\n", names[i], marks[i], grade);
			 
		}
	}
		public void account(int initialMoney, int interestRate, int endMoney) {
			int years = 0;
			int currentMoney = initialMoney;
			while(currentMoney < endMoney) {
				currentMoney = currentMoney + (currentMoney * interestRate / 100);
				years += 1;
			}
			endMoney = currentMoney;
			System.out.printf("It takes %d years to go from %d to %d with an interest rate of %d%%.", years, initialMoney, endMoney, interestRate);
		}
	 }
	

