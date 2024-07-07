package com.techlabs.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Inventory {
	private static ArrayList<Product> products = new ArrayList<>();
	private static ArrayList<Supplier> suppliers = new ArrayList<>();
	private static ArrayList<Transaction> transactions = new ArrayList<>();
	
	public Inventory() {
		super();
	}

	public static ArrayList<Product> getProducts() {
		return products;
	}
	public static void setProducts(ArrayList<Product> products) {
		Inventory.products = products;
	}



	public static ArrayList<Supplier> getSuppliers() {
		return suppliers;
	}
	public static void setSuppliers(ArrayList<Supplier> suppliers) {
		Inventory.suppliers = suppliers;
	}



	public static ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public static void setTransactions(ArrayList<Transaction> transactions) {
		Inventory.transactions = transactions;
	}

	
	public static void saveData() throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("inventory.txt"))) {
            out.writeObject(products);
            out.writeObject(suppliers);
            out.writeObject(transactions);
        }
    }
	
	@SuppressWarnings("unchecked")
	public static void loadData() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("inventory.txt"))) {
            products = (ArrayList<Product>) in.readObject();
            suppliers = (ArrayList<Supplier>) in.readObject();
            transactions = (ArrayList<Transaction>) in.readObject();
        }
    }

}
