package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class InventoryControl {
    private List<Product> inventory;

    public InventoryControl() {
        this.inventory = new ArrayList<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        inventory.add(product);
    }

    // Method to remove a product from the inventory
    public void removeProduct(Product product) {
        inventory.remove(product);
    }

    // Method to get the total quantity of products in the inventory
    public int getTotalQuantity() {
        return inventory.size();
    }

    // Method to get a list of all products in the inventory
    public List<Product> getAllProducts() {
        return new ArrayList<>(inventory);
    }

    // Other methods and specific inventory control logic can go here

    public static void main(String[] args) {
        // Example of usage
        InventoryControl control = new InventoryControl();

        // Create some products
        Product product1 = new Product("Product1", "Description1", "Tag1", "Supplier1");
        Product product2 = new Product("Product2", "Description2", "Tag2", "Supplier2");

        // Add products to the inventory
        control.addProduct(product1);
        control.addProduct(product2);

        // Show the total quantity of products
        System.out.println("Total quantity of products: " + control.getTotalQuantity());

        // Show all products in the inventory
        List<Product> allProducts = control.getAllProducts();
        for (Product product : allProducts) {
            System.out.println(product);
        }

        // Remove a product from the inventory
        control.removeProduct(product1);

        // Show the total quantity of products after removal
        System.out.println("Total quantity of products after removal: " + control.getTotalQuantity());
    }
}