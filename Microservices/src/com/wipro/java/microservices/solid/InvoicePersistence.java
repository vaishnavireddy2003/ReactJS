package com.wipro.java.microservices.solid;

import java.io.FileWriter;
import java.io.IOException;

public class InvoicePersistence {
    public void saveToFile(Invoice invoice, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Book: " + invoice.getBook().getTitle() + "\n");
            writer.write("Quantity: " + invoice.getQuantity() + "\n");
            writer.write("Total Price: $" + invoice.getTotalPrice() + "\n");
            System.out.println("Invoice saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving invoice: " + e.getMessage());
        }
    }
}
