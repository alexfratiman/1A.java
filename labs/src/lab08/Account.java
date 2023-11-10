package lab08;

public class Account {
	private int id;
	private String owner;
	private double balance;
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Deposit amount needs to be positive value.");
		}
		else {
			this.balance = this.balance + amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Cannot withdraw. The amount exceeds your current balance.");
		}
		else {
			balance -= amount;
		}
	}
	
	public void getDetails() {
		System.out.printf("Person %s with id %d has a balance of £%.2f", owner, id, balance);
	}
	
	

}
