package com.kodilla.good.patterns.food2door;

public class GlutenFreeShopProcessor implements OrderProcessor {

    public OrderDto process (Order order) {

        if (order.isGlutenFree()) {
            return new OrderDto(true, "We will send the product");
        } else {
            return new OrderDto(false, "We sell only Gluten free products");
        }
    }
}
