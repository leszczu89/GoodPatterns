package com.kodilla.good.patterns.food2door;

public class HealthyShopProcessor implements OrderProcessor{

    public OrderDto process (Order order) {

        SupplierReturner supplierReturner = new SupplierReturner();
        Supplier supplier = supplierReturner.returnSupplier(order);

        if (order.getProduct().equals("Carrot") && order.getQuantity()<=supplier.getQuantity()) {
            return new OrderDto(true, "We will send product immediately");
        } else if (order.getQuantity()>supplier.getQuantity()) {
            return new OrderDto(true, "We will send product when it grows");
        } else {
            return new OrderDto(false, "We don't have ordered product");
        }
    }
}
