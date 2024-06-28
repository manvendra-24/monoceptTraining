package com.techlabs.test;

import com.techlabs.model.User;
import com.techlabs.model.Book;
import com.techlabs.interfaces.IBorrowingService;
import com.techlabs.model.LibraryBorrowingService;


public class Test {
	public static void main(String[] args) {
		User user1 = new User("mk", "001");
		User user2 = new User("vs", "002");

		user1.registerUser();
		user2.registerUser();


		Book book1 = new Book("1984", "George Orwell");
		Book book2 = new Book("Digital Fortress", "Dan Brown");

		book1.catalogBook();
		book2.catalogBook();

		       
		IBorrowingService borrowingService = new LibraryBorrowingService();

		user1.borrowBook(borrowingService,book1);
		user2.borrowBook(borrowingService,book2);

		System.out.println("Is '1984' borrowed? " + book1.isBorrowed());
		System.out.println("Is 'Digital Fortress' borrowed? " + book2.isBorrowed());

		user1.returnBook(borrowingService, book1);
		user2.returnBook(borrowingService, book2);

		System.out.println("Is '1984' borrowed? " + book1.isBorrowed());
		System.out.println("Is 'Digital Fortress' borrowed? " + book2.isBorrowed());

    }

}
