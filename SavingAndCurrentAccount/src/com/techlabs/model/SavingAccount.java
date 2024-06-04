package com.techlabs.model;

public class SavingAccount extends Accounts {
	private int minBalance;
	
	

	public SavingAccount(int accountNumber, String name, int balance, int minBalance) {
		super(accountNumber, name, balance);
		this.minBalance = minBalance;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	
	public void displayDetails() {
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Holder Name: " + getName());
		System.out.println("Balance: " + getBalance());
		System.out.println("Minimum Balance: " + minBalance);
	}
}
