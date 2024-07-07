package com.techlabs.model;

import java.util.ArrayList;

public class AddAProduct {
	public void addAProduct(Product newProduct) {
		ArrayList<Product> products = Inventory.getProducts();
		products.add(newProduct);
		Inventory.setProducts(products);
	}
	
	
	
}
