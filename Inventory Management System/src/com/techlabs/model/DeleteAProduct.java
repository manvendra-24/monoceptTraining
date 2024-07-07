package com.techlabs.model;

import java.util.ArrayList;

public class DeleteAProduct {
	public void deleteAProduct(int productId) {
		ArrayList<Product> products = new ArrayList<>();
		for(Product product: Inventory.getProducts()) {
			if(productId == product.getProductId()) {
				continue;
			}
			products.add(product);
		}
		Inventory.setProducts(products);
	}
}
