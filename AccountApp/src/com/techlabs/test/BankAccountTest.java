package com.techlabs.test;

import com.techlabs.exceptions.InsufficientFundsException;
import com.techlabs.exceptions.NegativeAmountException;
import com.techlabs.model.BankAccount;

public class BankAccountTest {
	public static void main(String args[]) {
		try {
			BankAccount account1 = new BankAccount("Manvendra",100,10000);
			account1.deposit(1000);
			account1.withdraw(100000000);
			
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		catch(NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
	}
}
