package com.kodilla.good.patterns.challenges;

public class FoodOrderService implements OrderService{

    public boolean order(User user, Product product) {

        System.out.println(product.getProductName() + " was ordered");
        return true;
    }
}
