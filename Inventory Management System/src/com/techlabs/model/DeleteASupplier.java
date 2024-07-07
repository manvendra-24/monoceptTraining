package com.techlabs.model;

import java.util.ArrayList;

public class DeleteASupplier {
	public void deleteASupplier(int supplierId) {
		ArrayList<Supplier> suppliers = new ArrayList<>();
		for(Supplier supplier: Inventory.getSuppliers()) {
			if(supplierId == supplier.getSupplierId()) {
				continue;
			}
			suppliers.add(supplier);
		}
		Inventory.setSuppliers(suppliers);
	}
}
