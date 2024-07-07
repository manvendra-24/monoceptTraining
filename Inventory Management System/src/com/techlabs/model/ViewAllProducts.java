package com.techlabs.model;

import java.util.ArrayList;

public class ViewAllProducts {
	public ArrayList<Product> viewAllProducts() {
		for(Product product : Inventory.getProducts()) {
			System.out.println(product);
		}
		return Inventory.getProducts();
	}
}
