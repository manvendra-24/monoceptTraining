package com.techlabs.model;

public class SearchAProduct {
	public void searchAProduct(int productId) {
		for (Product product : Inventory.getProducts()) {
            if (product.getProductId() == productId) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("No Product available");
	}
}
