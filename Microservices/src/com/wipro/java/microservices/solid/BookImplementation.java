package com.wipro.java.microservices.solid;

public class BookImplementation implements BookInterface {
	private String title;
    private String author;
    private int year;
    private double price;
    private String isbn;

    public BookImplementation(String title, String author, int year, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public String getTitle() { return title; }

    @Override
    public String getAuthor() { return author; }

    @Override
    public int getYear() { return year; }

    @Override
    public double getPrice() { return price; }

    @Override
    public String getIsbn() { return isbn; }
}
