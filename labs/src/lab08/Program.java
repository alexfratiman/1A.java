package lab08;

public class Program {
	public static void main(String[] args) {
		Account account1 = new Account(123, "John", 12000);
		account1.deposit(100);
		account1.withdraw(200);
		account1.getDetails();
	}

}
