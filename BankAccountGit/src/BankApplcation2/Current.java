package BankApplcation2;

public class Current extends Account{
	 public Current(double balance,int accountNumber,double withdrawal){
	  if(balance<5000){
	 System.out.println("Minimum balance sould be 5000");
	 balance=0;
	 }
else
	 balance=balance;
}

}   
