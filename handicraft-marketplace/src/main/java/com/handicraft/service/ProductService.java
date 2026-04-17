package com.handicraft.service;

import com.handicraft.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void displayProducts() {
        for (Product p : products) {
            p.display();
        }
    }
}