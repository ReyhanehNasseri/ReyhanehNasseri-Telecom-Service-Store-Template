package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Store {

    protected List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    protected void addProduct(Product product){
        products.add(product);
    }
}
