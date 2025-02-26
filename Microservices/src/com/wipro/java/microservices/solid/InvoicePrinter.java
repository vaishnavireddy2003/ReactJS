package com.wipro.java.microservices.solid;

public class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Book: " + invoice.getBook().getTitle());
        System.out.println("Author: " + invoice.getBook().getAuthor());
        System.out.println("Year: " + invoice.getBook().getYear());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Total Price: $" + invoice.getTotalPrice());
    }
}
