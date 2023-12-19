package br.ufrn.imd.services;

import br.ufrn.imd.model.Category;
import br.ufrn.imd.model.Product;

import java.util.List;

public interface Stock {

    boolean add(Product p, int qnt);

    boolean removeBySky(String sku);

    int stockBySku(String sku);

    List<Product> allProducts();

    List<Product> productsByCategory(Category categories);

}
