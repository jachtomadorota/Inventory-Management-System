package com.dorota.inventorymanagementsystem;


import com.dorota.inventorymanagementsystem.model.Product;
import com.dorota.inventorymanagementsystem.repository.ProductMongoRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


@SpringBootTest(classes = InventoryManagementSystemApplication.class)
public class ProductMongoRepositoryTests {

    @Autowired
    private ProductMongoRepository productRepository;

    @BeforeAll
    public void setUp() throws Exception {
        Product shampoo = new Product("502334", "Alterna Caviar Moisture szampon 250ml", "Alterna", "szampon", 23, BigDecimal.valueOf(45), BigDecimal.valueOf(64), BigDecimal.valueOf(110), BigDecimal.valueOf(95));
        Product conditioner = new Product("502364", "Alterna Caviar Moisture odżywka 250ml", "Alterna", "odżywka", 23, BigDecimal.valueOf(45), BigDecimal.valueOf(64), BigDecimal.valueOf(110), BigDecimal.valueOf(95));
        assertNull(shampoo.getId());
        assertNull(conditioner.getId());
        this.productRepository.save(shampoo);
        this.productRepository.save(conditioner);
        assertNotNull(shampoo.getId());
        assertNotNull(conditioner.getId());
    }

    @Test
    public void fetchingData() throws Exception {
        Product product = this.productRepository.findProductByEAN("502334");
        assertNotNull(product);
        assertEquals(BigDecimal.valueOf(95), product.getSellPriceWholesale());
        List<Product> products = this.productRepository.findAll();
        assertEquals(products.size(), 2);
    }

    @Test
    public void updateData() throws Exception{
        Product product = this.productRepository.findProductByEAN("502334");
        product.setEAN("502333");
        this.productRepository.save(product);
        assertEquals("5002333",product.getEAN());
    }


    @After
    public void deletingData() throws Exception{
        this.productRepository.deleteAll();
    }

}
