package com.techlabs.test;

import java.io.IOException;
import java.util.Scanner;

import com.techlabs.exception.InsufficientStockException;
import com.techlabs.exception.ProductNotFoundException;
import com.techlabs.model.AddAProduct;
import com.techlabs.model.AddASupplier;
import com.techlabs.model.DeleteAProduct;
import com.techlabs.model.DeleteASupplier;
import com.techlabs.model.Inventory;
import com.techlabs.model.Product;
import com.techlabs.model.SearchAProduct;
import com.techlabs.model.SearchASupplier;
import com.techlabs.model.StockOperations;
import com.techlabs.model.Supplier;
import com.techlabs.model.UpdateAProduct;
import com.techlabs.model.UpdateASupplier;
import com.techlabs.model.ViewAllProducts;
import com.techlabs.model.ViewAllSuppliers;

public class InventoryManagement {
	public static void main(String args[]) {
		System.out.println("Welcome to the Inventory Management System");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1. Product Management");
			System.out.println("2. Supplier Management");
			System.out.println("3. Transaction Management");
			System.out.println("4. Save Data");
			System.out.println("5. Load Data");
			System.out.println("6. Generate Reports");
			System.out.println("7. Exit");
			System.out.println();
			System.out.println("Enter your Choice: ");
			int choice = scanner.nextInt();
			switch(choice) {
				case 1:
					productMenu();
					break;
				case 2:
					supplierMenu();
					break;
				case 3:
					stockMenu();
					break;
				case 4:
					saveData();
					break;
				case 5:
					loadData();
					break;
				case 6:
					generateReport();
					break;
				case 7:
					break;
				default:
					System.out.println("Invalid choice");	
			}
			if(choice == 7) break;
			System.out.println("\n");
		}
		System.out.println("Exited");
		scanner.close();

	}
	
	
	//PRODUCT MENU
	static void productMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Add Product");
		System.out.println("2. Update Product");
		System.out.println("3. Delete Product");
		System.out.println("4. View Product Details");
		System.out.println("5. View All Products");
		System.out.println("6. Go Back");
		System.out.println();
		System.out.println("Enter your Choice: ");
		String name, description;
		int productId, quantity, price;
		int choice2 = scanner.nextInt();
		switch(choice2) {
		case 1:
			//CREATING A NEW PRODUCT OBJECT
			System.out.println("Enter the name of Product: ");
			name = scanner.nextLine();
			System.out.println("Enter the description for the product: ");
			description = scanner.nextLine();
			System.out.println("Enter the quantity of product: ");
			quantity = scanner.nextInt();
			System.out.println("Enter the price of product: ");
			price = scanner.nextInt();
			Product newProduct = new Product(name, description, quantity, price);
			
			AddAProduct addinproducts = new AddAProduct();
			addinproducts.addAProduct(newProduct);
			
			System.out.println("Product Added successfully");
			break;
		case 2:
			//UPDATING A PRODUCT DETAILS
			System.out.println("Enter the product id to update the product details: ");
			productId = scanner.nextInt();
			System.out.println("Enter the new Product Name: ");
			name = scanner.nextLine();
			System.out.println("Enter the new Description: ");
			description = scanner.nextLine();
			System.out.println("Enter the new quantity: ");
			quantity = scanner.nextInt();
			System.out.println("Eter the new Price: ");
			price = scanner.nextInt();
			
			UpdateAProduct updateinproducts = new UpdateAProduct();
			updateinproducts.updateAProduct(productId, name, description, quantity, price);
			System.out.println("Product Updated Successfully");
			break;
		case 3:
			//DELETING A PRODUCT
			System.out.println("Enter the product Id to delete the product: ");
			productId = scanner.nextInt();
			
			DeleteAProduct deleteproduct = new DeleteAProduct();
			deleteproduct.deleteAProduct(productId);
			
			System.out.println("Product Deleted Successfully");
			break;
		case 4:
			//PRODUCT DETAILS
			System.out.println("Enter the product Id to view the product: ");
			productId = scanner.nextInt();
			
			SearchAProduct viewproduct = new SearchAProduct();
			viewproduct.searchAProduct(productId);
			break;
		case 5:
			//VIEWING ALL PRODUCTS LIST
			ViewAllProducts allproducts = new ViewAllProducts();
			allproducts.viewAllProducts();
			break;
		case 6:
			break;
		default:
			System.out.println("Invalid choice");
		}
		scanner.close();
	}
	
	
	//SUPPLIER MENU
	static void supplierMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Add Supplier");
		System.out.println("2. Update Supplier");
		System.out.println("3. Delete Supplier");
		System.out.println("4. View Supplier Details");
		System.out.println("5. View All Supplies");
		System.out.println("6. Go Back");
		System.out.println();
		System.out.println("Enter your Choice: ");
		int choice2 = scanner.nextInt();
		int contact,supplierId;
		String name;
		switch(choice2) {
		case 1:
			//CREATING A NEW SUPPLIER OBJECT
			System.out.println("Enter the name of Supplier: ");
			name = scanner.nextLine();
			System.out.println("Enter the Contact Number of Supplier: ");
			contact = scanner.nextInt();
			Supplier newSupplier = new Supplier(name, contact);
			
			AddASupplier addinsuppliers = new AddASupplier();
			addinsuppliers.addASupplier(newSupplier);
			
			System.out.println("Supplier Added successfully");
			break;
		case 2:
			//UPDATING A SUPPLIER DETAILS
			System.out.println("Enter the supplier id to update the supplier details: ");
			supplierId = scanner.nextInt();
			System.out.println("Enter the new Supplier Name: ");
			name = scanner.nextLine();
			System.out.println("Enter the new Contact Number: ");
			contact = scanner.nextInt();
			
			UpdateASupplier updateinsupplier = new UpdateASupplier();
			updateinsupplier.updateASupplier(supplierId, name, contact);
			
			System.out.println("Supplier Updated Successfully");
			break;
		case 3:
			//DELETING A SUPPLIER
			System.out.println("Enter the Supplier Id to delete the supplier: ");
			supplierId = scanner.nextInt();
			
			DeleteASupplier deletesupplier = new DeleteASupplier();
			deletesupplier.deleteASupplier(supplierId);
			
			System.out.println("Supplier Deleted Successfully");
			break;
		case 4:
			//SUPPLIER DETAILS
			System.out.println("Enter the Supplier Id to view the Supplier: ");
			supplierId = scanner.nextInt();
			
			SearchASupplier viewsupplier = new SearchASupplier();
			viewsupplier.searchASupplier(supplierId);
			break;
		case 5:
			//VIEWING ALL SUPPLIER LIST
			ViewAllSuppliers allsuppliers = new ViewAllSuppliers();
			allsuppliers.viewAllSuppliers();
			break;
		case 6:
			break;
		default:
			System.out.println("Invalid choice");
		}
		scanner.close();
		
	}
	
	
	//STOCK MENU
	static void stockMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Add Stock");
		System.out.println("2. Remove Stock");
		System.out.println("3. View Transaction History");
		System.out.println("4. Go Back");
		System.out.println();
		System.out.println("Enter your Choice: ");
		StockOperations stockOperations = new StockOperations();
		int choice2 = scanner.nextInt();
		int productId, quantity;
		switch(choice2) {
		case 1:
			System.out.println("Enter the product id: ");
			productId = scanner.nextInt();
			System.out.println("Enter the quantity: ");
			quantity = scanner.nextInt();
			try {
				stockOperations.addStock(productId, quantity);
				System.out.println("Stock added");
			} catch (ProductNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Enter the product id: ");
			productId = scanner.nextInt();
			System.out.println("Enter the quantity: ");
			quantity = scanner.nextInt();
			try {
				stockOperations.removeStock(productId, quantity);
				System.out.println("Stock removed");
			} catch (ProductNotFoundException | InsufficientStockException e) {
				e.printStackTrace();
			}
			
			break;
		case 3:
			System.out.println("Enter the product id: ");
			productId = scanner.nextInt();
			try {
				stockOperations.viewTransactionHistory(productId);
			} catch (ProductNotFoundException e) {
				e.printStackTrace();
			}
			break;
		case 4:
			break;
		default:
			System.out.println("Invalid choice");
		}
		scanner.close();
	}
	
	
	//SAVING DATA
	private static void saveData() {
        try {
            Inventory.saveData();
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

	
	//LOADING DATA
    private static void loadData() {
        try {
            Inventory.loadData();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    
    //GENERATING REPORT
    private static void generateReport() {
    	ViewAllProducts allproducts = new ViewAllProducts();
        int totalProducts = allproducts.viewAllProducts().size();
        double totalStockValue = allproducts.viewAllProducts().stream()
            .mapToDouble(p -> p.getQuantity() * p.getPrice())
            .sum();
        System.out.println("Total Number of Products: " + totalProducts);
        System.out.println("Total Stock Value: " + totalStockValue);
    }
}
