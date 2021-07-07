package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository{

    public boolean createOrder(User user, Product product) {

        System.out.println("Order for: " + product.getProductName() + ", was created by: " + user.getName() + " "+ user.getSurname());
        return true;
    }
}
