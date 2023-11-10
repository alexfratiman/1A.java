package lab06;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lab6 lab6 = new Lab6();
		lab6.part1(scanner);
		scanner.close();
		lab6.account(100, 5, 200);
	}

}
