package BankApplcation2;

public class Saving extends Account 
{
	
	public Saving(double balance, int accountNumber, double withdrawal) 
	{

		if (balance < 500) {
			System.out.println("Minimum balance sould be 500");
			balance = 0;
		} else
			balance = balance;
	}

	private static double newBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	// in terms of 100
	/*public double withdraw(double amount) {

		if (getBalance() < amount) {

			if (amount % 100 == 0)
				System.out.println("Amount is larger than current balance.");
			else
				System.out.println("Withdraw amount in multiples of 100");
		}
		//return super.withdraw(amount);
	}*/

	public void setWithdraw(double amount, double totalWithdraws) {
		balance -= amount;
		totalWithdraws += amount;
	}

	public void displayData() {
		balance = Math.round(balance * 100.0) / 100.0;

		System.out.println();
		System.out.println("The balance is: $" + balance);

	}

}
