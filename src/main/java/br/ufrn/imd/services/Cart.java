package br.ufrn.imd.services;

import br.ufrn.imd.model.Product;

import java.util.List;

public interface Cart {

    boolean add(Product p, int qnt);

    boolean removeBySky(String sku);

    int stockBySku(String sku);

    List<Product> listAll();

}
