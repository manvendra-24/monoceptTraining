package com.techlabs.exception;

@SuppressWarnings("serial")
public class DuplicateSupplierException extends Exception{
	public DuplicateSupplierException(String message) {
		super(message);
	}
}
