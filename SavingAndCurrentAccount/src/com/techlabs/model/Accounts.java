package com.techlabs.model;

public class Accounts {
	private int accountNumber;
	private String name;
	private int balance;
	Accounts(int accountNumber,String name, int balance){
		this.accountNumber = accountNumber;
		this.name =name;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void credit(int toCredit) {
		balance += toCredit;
	}
	public void debit(int toDebit) {
		balance -= toDebit;
	}
}
