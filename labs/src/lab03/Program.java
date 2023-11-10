package lab03;

import java.util.Scanner;

public class Program {
		
	    public static void main(String[] args){
	    	Scanner scanner = new Scanner(System.in);
	    	
	        int intResult = getInt("Please enter a number: ", scanner);
	        
	        // Clear the scanner
	        scanner.nextLine();
	        
	        String strResult = getString("Please enter a string: ", scanner);

	        System.out.println("Number is: " + intResult);
	        System.out.println("String is: " + strResult);
	        theLunchQueue(scanner);
	        
	        int poundsValue = getInt("What is the total weight in pounds? ", scanner);
	        convertInputToStonesPounds(poundsValue);
	        
	        scanner.close();
	    }

	    public static int getInt(String prompt, Scanner scanner){
	        System.out.println(prompt);
	        int result = scanner.nextInt();
	        return result; 
	    }
	    
	    public static String getString(String prompt, Scanner scanner){
	        System.out.println(prompt);
	        String result = scanner.nextLine();
	        return result;
	    }
	    
	    public static void theLunchQueue(Scanner scanner){
			String mainCourse = getString("What main dish would you like(Fish, Burgers or veg)?:", scanner);
	        int potatoesNumber = getInt("How many roast potatoes would you like?", scanner);
	        int sproutsNumber = getInt("How many Brussel Sprouts would you like?", scanner);
	        System.out.println("Hello, your lunch is " + mainCourse + " with " + potatoesNumber + " roast potatoes and " + sproutsNumber + " Brussel sprouts."); 
	    }
	    
	    public static void convertInputToStonesPounds(int pounds) {
			
	    }
	}