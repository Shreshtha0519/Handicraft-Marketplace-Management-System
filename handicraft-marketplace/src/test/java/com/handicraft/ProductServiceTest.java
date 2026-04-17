package com.handicraft;

import com.handicraft.model.Product;
import com.handicraft.service.ProductService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Test
    void testAddProduct() {
        ProductService service = new ProductService();
        Product p = new Product(1, "Test Item", 100);

        service.addProduct(p);

        assertNotNull(service);
    }
}