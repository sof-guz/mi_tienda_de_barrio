package org.example.Model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Billing {
    private List<Order> orders;

    public Billing() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public int getTotalOrders() {
        return orders.size();
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Product1", "Description1", "Tag1", "Supplier1");
        Product product2 = new Product("Product2", "Description2", "Tag2", "Supplier2");

        Order order1 = new Order(1, new Date());
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(2, new Date());
        order2.addProduct(product1);

        Billing billing = new Billing();
        billing.addOrder(order1);
        billing.addOrder(order2);

        System.out.println("Total number of orders: " + billing.getTotalOrders());

        List<Order> allOrders = billing.getAllOrders();
        for (Order order : allOrders) {
            System.out.println(order);
        }

        billing.removeOrder(order1);

        System.out.println("Total number of orders after removal: " + billing.getTotalOrders());
    }
}
