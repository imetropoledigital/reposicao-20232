package br.ufrn.imd.controller;

import br.ufrn.imd.model.Category;
import br.ufrn.imd.model.Product;

import java.util.Collections;
import java.util.List;

public class StockController {

    public boolean add(Product p, int qnt){
        return false;
    }

    public boolean removeBySky(String sku){
        return false;
    }

    public int stockBySku(String sku){
        return 0;
    }

    List<Product> allProducts(){
        return Collections.emptyList();
    }

    List<Product> productsByCategory(Category categories){
        return Collections.emptyList();
    }

}
