package com.handicraft.main;

import com.handicraft.model.Product;
import com.handicraft.service.ProductService;

public class App {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product(1, "Handmade Vase", 500));
        service.addProduct(new Product(2, "Wooden Sculpture", 1200));

        System.out.println("Handicraft Products:");
        service.displayProducts();
    }
}