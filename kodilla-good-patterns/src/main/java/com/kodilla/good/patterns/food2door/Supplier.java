package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class Supplier {

    private String name;
    private String product;
    private int quantity;

    public Supplier(String name, String product, int quantity) {
        this.name = name;
        this.product = product;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
