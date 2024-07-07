package com.techlabs.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import com.techlabs.exception.InsufficientStockException;
import com.techlabs.exception.ProductNotFoundException;
import com.techlabs.interfaces.IStocks;

public class StockOperations implements IStocks{
	public void addStock(int productId, int quantity) throws ProductNotFoundException {
        Product product = Inventory.getProducts().get(productId);
        if (product == null) {
            throw new ProductNotFoundException("No product found with ID: " + productId);
        }
        product.setQuantity(product.getQuantity() + quantity);
        Transaction transaction = new Transaction(productId, "remove", quantity, new Date());
        Inventory.getTransactions().add(transaction);
    }
	

    public void removeStock(int productId, int quantity) throws ProductNotFoundException, InsufficientStockException {
        Product product = Inventory.getProducts().get(productId);
        if (product == null) {
            throw new ProductNotFoundException("No product found with ID: " + productId);
        }
        if (product.getQuantity() < quantity) {
            throw new InsufficientStockException("Insufficient stock for product ID: " + productId);
        }
        product.setQuantity(product.getQuantity() - quantity);
        Transaction transaction = new Transaction(productId, "remove", quantity, new Date());
        Inventory.getTransactions().add(transaction);
    }

    public Collection<Transaction> viewTransactionHistory(int productId) throws ProductNotFoundException {
    	Product product = Inventory.getProducts().get(productId);
        if(product  == null) {
            throw new ProductNotFoundException("No product found with ID: " + productId);
        }
        Collection<Transaction> productTransactions = new ArrayList<>();
        for (Transaction transaction: Inventory.getTransactions()) {
            if (transaction.getProductId() == productId) {
                productTransactions.add(transaction);
            }
        }
        return productTransactions;
    }

}
