package org.example.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Order {
    private int orderNumber;
    private Date date;
    private List<Product> products;

    public Order(int orderNumber, Date date) {
        this.orderNumber = orderNumber;
        this.date = date;
        this.products = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Date getDate() {
        return date;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", date=" + date +
                ", products=" + products +
                '}';
    }
}