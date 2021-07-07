package com.kodilla.good.patterns.food2door;

public class ExtraFoodShopProcessor implements OrderProcessor{

    public OrderDto process(Order order) {

        AvailabilityChecker availabilityChecker = new AvailabilityChecker();
        boolean isAvailable = availabilityChecker.checkIfProductIsAvailable(order);

        if (isAvailable) {
            return new OrderDto(true, "Product will be send");
        } else {
            return new OrderDto(false, "We do not have ordered product");
        }

    }
}
