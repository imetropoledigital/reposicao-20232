package br.ufrn.imd.model;

import java.math.BigDecimal;

public class Book extends Product{

    private String author;

    private int pages;

    public Book(String sku, String name, BigDecimal price, String description, Category category, String author, int pages) {
        super(sku, name, price, description, category);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

}


