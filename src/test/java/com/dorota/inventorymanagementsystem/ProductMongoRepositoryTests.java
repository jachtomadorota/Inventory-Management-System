package com.dorota.inventorymanagementsystem;


import com.dorota.inventorymanagementsystem.model.Product;
import com.dorota.inventorymanagementsystem.repository.ProductMongoRepository;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = InventoryManagementSystemApplication.class)
public class ProductMongoRepositoryTests {

    @Autowired
    private ProductMongoRepository productRepository;

    @BeforeAll
    public void setUp() throws Exception{
        Product shampoo = new Product()
    }


}
