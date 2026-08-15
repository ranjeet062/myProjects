package org.design.structural.pattern.Facade;

public class ShipmentService {
    public void arrangeShipment(String address, String item, int quantity) {
        System.out.println("Arranging shipment to address: " + address + ", item: " + item + ", quantity: " + quantity);
    }
}
