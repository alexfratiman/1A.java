package lab05;

import java.util.Scanner;

public class Lab5 {
	 
	public static int getInt(String prompt, Scanner scanner){
        System.out.println(prompt);
        int result = scanner.nextInt();
        return result; 
    }
	
	
	
	
	public void grades(Scanner scanner) {
		 int grade = getInt("Please input your grade from 1-100", scanner);
		 if((grade < 1) || (grade > 100)) {
			 System.out.println("Error: marks must be between 1..100");
		 } 
		 else if(grade < 50) {
			 System.out.println("Your grade is Fail");
		 }
		 else if(grade >= 50 && grade <= 60) {
			 System.out.println("Your grade is Pass");
		 }
		 else if(grade >= 61 && grade <= 70) {
			 System.out.println("Your grade is Merit");
		 }
		 else if(grade >= 71) {
			 System.out.println("Your grade is Distinction");
		 }
	 }
}
