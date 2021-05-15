package com.dorota.inventorymanagementsystem;


import com.dorota.inventorymanagementsystem.model.Product;
import com.dorota.inventorymanagementsystem.repository.ProductMongoRepository;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;
import java.math.BigDecimal;


@SpringBootTest(classes = InventoryManagementSystemApplication.class)
public class ProductMongoRepositoryTests {

    @Autowired
    private ProductMongoRepository productRepository;

    @BeforeAll
    public void setUp() throws Exception{
        Product shampoo = new Product("502334","Alterna Caviar Moisture szampon 250ml","Alterna","szampon",23, BigDecimal.valueOf(45),BigDecimal.valueOf(64),BigDecimal.valueOf(110),BigDecimal.valueOf(95));
        Product conditioner = new Product("502364","Alterna Caviar Moisture odżywka 250ml","Alterna","odżywka",23, BigDecimal.valueOf(45),BigDecimal.valueOf(64),BigDecimal.valueOf(110),BigDecimal.valueOf(95));
        assertNull(shampoo.getId());
        assertNull(conditioner.getId());
        this.productRepository.save(shampoo);
        this.productRepository.save(conditioner);
        assertNotNull(shampoo.getId());
        assertNotNull(conditioner.getId());
    }


}