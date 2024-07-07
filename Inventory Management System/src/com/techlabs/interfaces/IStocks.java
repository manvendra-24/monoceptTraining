package com.techlabs.interfaces;

import java.util.Collection;

import com.techlabs.exception.InsufficientStockException;
import com.techlabs.exception.ProductNotFoundException;
import com.techlabs.model.Transaction;

public interface IStocks {
	void addStock(int productId, int quantity) throws ProductNotFoundException;
    void removeStock(int productId, int quantity) throws ProductNotFoundException, InsufficientStockException;
    Collection<Transaction> viewTransactionHistory(int productId) throws ProductNotFoundException;
}
