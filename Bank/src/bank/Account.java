package bank;

public class Account {
	
	private int account_number;
	private double balance;

	// Set balance to 0.00
	
	public Account(){
		balance = 0.0;
		account_number = 0;
	}
	
	public void acc_number(int number){
		account_number = number;
	}
	
	// Deposit
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	// Widthraw
	
	public void withdraw(double amount){
		balance = balance - amount;
	}
	
	public double getBalance(){
		return balance;
	}
	
	
}
