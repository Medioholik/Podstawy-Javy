package bank;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		
		System.out.print("Enter account number:\n");
		
		String input = System.console().readLine();
		int number = Integer.parseInt(input);
		
		account.acc_number(number);
		
		
	}

}
