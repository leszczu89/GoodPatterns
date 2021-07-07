package com.kodilla.good.patterns.food2door;

public class OrderService {

    private OrderProcessor orderProcessor;

    public OrderService(final OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public void orderProduct(final OrderRetrieval orderRetrieval) {

        Order order = orderRetrieval.retrieveOrder();

        OrderDto orderDto = orderProcessor.process(order);

        MailService mailService = new MailService();
        mailService.inform(orderDto, order.getUser());

        if (orderDto.isAvailable) {
            SupplierReturner supplierReturner = new SupplierReturner();
            Supplier supplier = supplierReturner.returnSupplier(order);
            System.out.println("Order is completed");
            supplier.setQuantity(supplier.getQuantity()-order.getQuantity());
            System.out.println("\nQuantity after purchase: " + supplier.getQuantity());
        } else {
            System.out.println("The order has not been processed");
        }
    }
}
