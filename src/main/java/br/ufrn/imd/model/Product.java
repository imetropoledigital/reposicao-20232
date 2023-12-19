package br.ufrn.imd.model;

import java.math.BigDecimal;

public abstract class Product {

    protected String sku;

    protected String name;

    protected BigDecimal price;

    private String description;

    private Category category;

    public Product(String sku, String name, BigDecimal price, String description, Category category) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }
}
