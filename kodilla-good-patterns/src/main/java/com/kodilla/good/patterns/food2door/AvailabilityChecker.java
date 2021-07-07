package com.kodilla.good.patterns.food2door;

import java.util.List;

public class AvailabilityChecker {

    public boolean checkIfProductIsAvailable (Order order) {

        SupplierReturner supplierReturner = new SupplierReturner();
        Supplier supplier = supplierReturner.returnSupplier(order);

        return supplier != null && supplier.getProduct().equals(order.getProduct()) && supplier.getQuantity() >= order.getQuantity();

    }
}
