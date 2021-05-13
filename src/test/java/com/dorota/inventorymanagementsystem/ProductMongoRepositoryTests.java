package com.dorota.inventorymanagementsystem;


import com.dorota.inventorymanagementsystem.repository.ProductMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = InventoryManagementSystemApplication.class)
public class ProductMongoRepositoryTests {

    @Autowired
    private ProductMongoRepository productRepository;


}
