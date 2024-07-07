package com.techlabs.model;


public class Product{
	private static int idCounter = 0;
	private int productId;
	private String name;
	private String description;
	private int quantity;
	private double price;
	public Product( String name, String description, int quantity, double price) {
		super();
		this.productId = ++idCounter;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return productId + "\t" + name + "\t" + description + "\t" + quantity +"\t" + price;
	}
	
	
	
	
}
