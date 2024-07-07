package com.techlabs.model;

public class UpdateAProduct {
	public void updateAProduct(int productId, String name, String description, int quantity, int price) {
		for (Product product : Inventory.getProducts()) {
			if (product.getProductId() == productId) {
				product.setName(name);
				product.setDescription(description);
				product.setQuantity(quantity);
				product.setPrice(price);
			}
		}
		System.out.println("No product available");
	}
	
}
