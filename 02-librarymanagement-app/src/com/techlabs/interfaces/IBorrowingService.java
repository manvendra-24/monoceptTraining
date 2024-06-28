package com.techlabs.interfaces;

import com.techlabs.model.User;

public interface IBorrowingService {
	void borrowBook(User user, IBorrowable book);
	void returnBook(User user, IBorrowable book);
}
