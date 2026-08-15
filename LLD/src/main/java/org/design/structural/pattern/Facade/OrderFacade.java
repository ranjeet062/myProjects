package org.design.structural.pattern.Facade;

public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShipmentService shipmentService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shipmentService = new ShipmentService();
    }

    public void placeOrder(String item, int quantity, String paymentType, double amount, String address) {
        if (inventoryService.checkStock(item, quantity)) {
            paymentService.processPayment(paymentType, amount);
            shipmentService.arrangeShipment(address, item, quantity);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Item is out of stock!");
        }
    }
}
