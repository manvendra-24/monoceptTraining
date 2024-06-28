package com.techlabs.interfaces;

import com.techlabs.model.User;

public interface IBorrowable {
	void borrowBook(User user);
	void returnBook(User user);
}
