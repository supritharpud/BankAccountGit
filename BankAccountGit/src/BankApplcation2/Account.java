package BankApplcation2;

public class Account {
	String name;
	String location;

	protected int accountNo;
	protected double balance;

	Account() {

	}
	
	
	// accessor/mutator methods for id, balance, and annualInterestRate

	

	public double getBalance() {
		return balance;
	}

	

	public void setBalance(double newBalance) {
		balance = newBalance;

	}

	

	// define method withdraw

	//double withdraw(double amount) {

	//	return balance -= amount;
	//}

	// define method deposit

	double deposit(double amount) {

		return balance += amount;

	}

	/*double withdraw(double amount) {
		if (amount % 100 == 0) {
			balance -= amount;
		}*/
	//}
	public void displayData() {
		balance = Math.round(balance * 100.0) / 100.0;

		System.out.println();

		System.out.println("The balance is: $" + balance);
		System.out.println("Total amount of withdraws: $" );
	}

	public void Saving() {
		// TODO Auto-generated method stub

	}
}
