package org.example.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product {
    private String name;
    private String description;
    private String tag;
    private String supplier;

    public Product(String name, String description, String tag, String supplier) {
        this.name = name;
        this.description = description;
        this.tag = tag;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTag() {
        return tag;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
