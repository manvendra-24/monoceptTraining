package com.techlabs.exception;

@SuppressWarnings("serial")
public class DuplicateProductException extends Exception{
	public DuplicateProductException(String message) {
		super(message);
	}
}
