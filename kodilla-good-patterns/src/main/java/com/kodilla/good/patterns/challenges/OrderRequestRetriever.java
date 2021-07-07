package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("James", "Bond");
        Product product = new Product("Martini", 7);

        return new OrderRequest(user, product);
    }
}
