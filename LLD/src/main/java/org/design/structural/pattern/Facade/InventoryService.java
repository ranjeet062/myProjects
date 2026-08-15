package org.design.structural.pattern.Facade;

public class InventoryService {
    public boolean checkStock(String item, int quantity) {
        System.out.println("Checking stock for item: " + item + ", quantity: " + quantity);
        // For simplicity, assume all items are in stock
        return true;
    }
}
