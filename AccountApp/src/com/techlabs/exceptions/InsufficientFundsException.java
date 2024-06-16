package com.techlabs.exceptions;
/*Create Custom Exceptions:
•  Define custom exceptions InsufficientFundsException and NegativeAmountException that extend Exception.
Create the BankAccount Class:
•  Implement a class BankAccount with methods deposit(double amount) and withdraw(double amount) that throw the respective exceptions when necessary.
Test the Application:
•  Write a main method to test deposit and withdrawal operations*/
public class InsufficientFundsException extends RuntimeException{
	public String getMessage() {	
		return "Insufficient Fund";
	}
}
