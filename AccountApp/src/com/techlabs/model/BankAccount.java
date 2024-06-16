package com.techlabs.model;

import com.techlabs.exceptions.InsufficientFundsException;
import com.techlabs.exceptions.NegativeAmountException;

public class BankAccount {
	private String name;
	private int accountNumber;
	private int balance;
	
	public BankAccount(String name, int accountNumber, int balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		if(amount < 0) {
			throw new NegativeAmountException();
		}
		balance += amount;
		System.out.println("Amount is credited");
	}
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new InsufficientFundsException();
		}
		balance -= amount;
		System.out.println("A Amount of "+ amount+ " has been debited");
	}
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+ balance);
	}
}
