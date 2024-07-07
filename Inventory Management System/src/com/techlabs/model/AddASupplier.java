package com.techlabs.model;

import java.util.ArrayList;

public class AddASupplier {
	public void addASupplier(Supplier newSupplier) {
		ArrayList<Supplier> suppliers = Inventory.getSuppliers();
		suppliers.add(newSupplier);
		Inventory.setSuppliers(suppliers);
	}
}
