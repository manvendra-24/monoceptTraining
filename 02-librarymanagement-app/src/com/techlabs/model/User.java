package com.techlabs.model;

import com.techlabs.interfaces.IBorrowable;
import com.techlabs.interfaces.IBorrowingService;

public class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }
    
    public void borrowBook(IBorrowingService borrowingService, IBorrowable book) {
        borrowingService.borrowBook(this, book);
    }

    public void returnBook(IBorrowingService borrowingService, IBorrowable book) {
        borrowingService.returnBook(this, book);
    }
    
    public void registerUser() {
    	System.out.println(name + " registered with ID " + userId);
    }
    
    
}