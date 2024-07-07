package com.techlabs.model;

public class UpdateASupplier {
	public void updateASupplier(int supplierId, String name, int contact) {
		for (Supplier supplier : Inventory.getSuppliers()) {
			if (supplier.getSupplierId() == supplierId) {
				supplier.setName(name);
				supplier.setContact(contact);
			}
		}
		System.out.println("No Supplier available");
	}
}
