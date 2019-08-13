package BankApplcation2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int a = sc.nextInt();
		if (a >= 18) {
			System.out.println("Account can be created");
		
			System.out.println("Enter the name");
			Account ac = new Account();
			ac.name=sc.next();
			
			System.out.println("Enter the location");
			ac.location =sc.next();
			
			System.out.println("Press 1 for saving account and press 2 for current account");
			int n=sc.nextInt();
			switch(n){
			case 1: Saving s=new Saving(500,1001 ,100);
			System.out.println(n);
			System.out.println("Entert the balance");

			
			break;
			case 2: 
			break;
			
			}
		//Saving s=new Saving();
		//Current c=new Current();
			
			System.out.println("name:" + ac.name);
			System.out.println("Location=" + ac.location);
			System.out.println("age=" + a);
		} else
			System.out.println("Not Eligible for account creation");
			int balance = sc.nextInt();

	}
}