package com.techlabs.exception;

@SuppressWarnings("serial")
public class InsufficientStockException extends Exception{
	public InsufficientStockException(String message) {
		super(message);
	}
}
