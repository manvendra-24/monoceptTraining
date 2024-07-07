package com.techlabs.model;

public class SearchASupplier {
	public void searchASupplier(int supplierId) {
		for (Supplier supplier : Inventory.getSuppliers()) {
            if (supplier.getSupplierId() == supplierId) {
                System.out.println(supplier);
                return;
            }
        }
        System.out.println("No Supplier available");
	}
}
