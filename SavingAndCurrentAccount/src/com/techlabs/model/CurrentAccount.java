package com.techlabs.model;

public class CurrentAccount extends Accounts{
	private int overDraftLimit;
	public CurrentAccount(int accountNumber, String name, int balance, int overDraftLimit) {
		super(accountNumber, name, balance);
		this.overDraftLimit = overDraftLimit;
	}

	public int getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	public void displayDetails() {
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Holder Name: " + getName());
		System.out.println("Balance: " + getBalance());
		System.out.println("OverDraft Limit: " + overDraftLimit);
	}
}
