package com.kodilla.good.patterns.food2door;

public class OrderRetrieval {

    public Order retrieveOrder() {
        User user = new User("Jan", "Kowalski");

        return new Order(user, "Coconut Milk", 10, "Extra Food Shop", false);
    }
}
