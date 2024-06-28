package com.techlabs.model;

import com.techlabs.interfaces.IBorrowable;
import com.techlabs.interfaces.IBorrowingService;

public class LibraryBorrowingService implements IBorrowingService{
	@Override
	public void borrowBook(User user, IBorrowable book) {
		book.borrowBook(user);
	}
	
	@Override
	public void returnBook(User user, IBorrowable book) {
		book.returnBook(user);
	}
}
