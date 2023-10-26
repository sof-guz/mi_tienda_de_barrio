package org.example.Model;


public class Inventory {
    private String name;
    private String description;
    private String tag;
    private String supplier;
    @Override
    public String toString() {
        return "Inventory{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }


    public Inventory(String name, String description, String tag, String supplier) {
        this.name = name;
        this.description = description;
        this.tag = tag;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }





}

