package com.techlabs.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Supplier implements Serializable{
	int supplierCounter = 0;
	private int supplierId;
	private String name;
	private int contact;
	public Supplier(String name, int contact) {
		super();
		this.supplierId = ++supplierCounter;
		this.name = name;
		this.contact = contact;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return supplierId + "\t" + name + "\t" + contact;
	}
	
	
	
}
