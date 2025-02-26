package com.wipro.java.microservices.solid;

public class Book {
    private String title;
    private String author;
    private int year;
    private double price;
    private String isbn;

    public Book(String title, String author, int year, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getIsbn() { return isbn; }
}
