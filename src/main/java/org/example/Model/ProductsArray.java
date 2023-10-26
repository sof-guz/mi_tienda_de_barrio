package org.example.Model;

import org.example.Model.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductsArray {
    private List<Product> products;

    public ProductsArray() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (products.size() < 20) {
            products.add(product);
        } else {
            System.out.println("Cannot add more products. The list is full.");
        }
    }

    public void displayProductsStartingWith(char letter) {
        System.out.println("\n---- Products starting with the letter '" + letter + "' ----");
        for (Product product : products) {
            if (product.getName().toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                System.out.println(product);
            }
        }
    }

    public void displayProductsInAlphabeticalOrder() {
        System.out.println("\n---- Products in alphabetical order ----");
        List<Product> sortedProducts = new ArrayList<>(products);
        Collections.sort(sortedProducts, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareToIgnoreCase(p2.getName());
            }
        });
        for (Product product : sortedProducts) {
            System.out.println(product);
        }
    }
}