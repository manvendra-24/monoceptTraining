package com.techlabs.model;

import com.techlabs.interfaces.IBookInfo;
import com.techlabs.interfaces.IBorrowable;
import com.techlabs.interfaces.ICatalogable;

public class Book implements IBookInfo, IBorrowable, ICatalogable{
	private String title;
	private String author;
	private boolean isBorrowed;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isBorrowed = false;
	}

	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public boolean isBorrowed() {
		return isBorrowed;
	}
	
	@Override
	public void catalogBook() {
	     System.out.println("Cataloged: " + title);
	}

	@Override
	public void borrowBook(User user) {
	      isBorrowed = true;
	      System.out.println(user.getName() + " borrowed " + title);
	}

	@Override
	public void returnBook(User user) {
		isBorrowed = false;
	    System.out.println(user.getName() + " returned " + title);
		
	}
}
