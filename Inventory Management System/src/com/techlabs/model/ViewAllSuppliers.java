package com.techlabs.model;

public class ViewAllSuppliers {
	public void viewAllSuppliers() {
		for(Supplier supplier : Inventory.getSuppliers()) {
			System.out.println(supplier);
		}
	}
}
