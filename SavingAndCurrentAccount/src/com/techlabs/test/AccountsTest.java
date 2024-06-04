package com.techlabs.test;

import com.techlabs.model.*;
import java.util.Scanner;

public class AccountsTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Do you want to create an account? (y/n) ");
			String str = scanner.next();
			if(str.charAt(0) == 'y') {
				System.out.println("Enter the account Type: ");
				System.out.println("1. Saving Account");
				System.out.println("2. Current Account");
				int accountType = scanner.nextInt();
				if(accountType == 1) {
					System.out.println("You choose Savings account.");
					System.out.println("Enter the account number: ");
					int accountNumber = scanner.nextInt();
					System.out.println("Enter the Name: ");
					String name = scanner.next();
					System.out.println("Enter the balance: ");
					int balance = scanner.nextInt();
					System.out.println("Enter the minium balance: ");
					int minBalance = scanner.nextInt();
					SavingAccount account = new SavingAccount(accountNumber, name, balance, minBalance);
					outerloop:
					while(true) {
						System.out.println("Select Operation: ");
						System.out.println("1. Display Details");
						System.out.println("2. Credit into Account");
						System.out.println("3. Debit from Account");
						System.out.println("4. Exit");
						int toChoose = scanner.nextInt();
						switch(toChoose){
							case 1:
								account.displayDetails();
								break;
							case 2:
								System.out.println("Enter amount to credit: ");
								int toCredit = scanner.nextInt();
								account.credit(toCredit);
								break;
							case 3:
								System.out.println("Enter amount to debit: ");
								int toDebit = scanner.nextInt();
								account.debit(toDebit);
								break;
							case 4:
								break outerloop;
						}
					}
					
				}
				if(accountType == 2) {
					System.out.println("You choose Current account.");
					System.out.println("Enter the account number: ");
					int accountNumber = scanner.nextInt();
					System.out.println("Enter the Name: ");
					String name = scanner.next();
					System.out.println("Enter the balance: ");
					int balance = scanner.nextInt();
					System.out.println("Enter Over Draft Limit: ");
					int overDraftLimit = scanner.nextInt();
					CurrentAccount account = new CurrentAccount(accountNumber, name, balance, overDraftLimit);
					System.out.println("Select Operation: ");
					System.out.println("1. Display Details");
					System.out.println("2. Credit into Account");
					System.out.println("3. Debit from Account");
					System.out.println("4. Exit");
					int toChoose = scanner.nextInt();
					outerloop:
					switch(toChoose){
						case 1:
							account.displayDetails();
							break;
						case 2:
							System.out.println("Enter amount to credit: ");
							int toCredit = scanner.nextInt();
							account.credit(toCredit);
							break;
						case 3:
							System.out.println("Enter amount to debit: ");
							int toDebit = scanner.nextInt();
							account.debit(toDebit);
							break;
						case 4:
							break outerloop;
					}
				}
			}
			if(str.charAt(0) == 'n') {
				System.out.println("Thank you!");
				break;
			}
		}
		scanner.close();
	}
}
