package com.kodilla.good.patterns.food2door;

public class Order {

    private final User user;
    private final String product;
    private final int quantity;
    private final String supplierName;
    private final boolean glutenFree;

    public Order(User user, String product, int quantity, String supplierName, boolean glutenFree) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.supplierName = supplierName;
        this.glutenFree = glutenFree;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }
}
