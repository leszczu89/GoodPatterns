package com.kodilla.good.patterns.food2door;

import java.util.List;

public class SupplierReturner {

    public Supplier returnSupplier (Order order) {

        SuppliersRetrieval suppliersRetrieval = new SuppliersRetrieval();
        List<Supplier> suppliersList = suppliersRetrieval.retrieveSuppliers();
        Supplier supplier = null;
        for (Supplier supplier1: suppliersList) {
            if (supplier1.getName().equals(order.getSupplierName())){
                supplier = supplier1;
                break;
            }
        }
        return supplier;
    }
}
