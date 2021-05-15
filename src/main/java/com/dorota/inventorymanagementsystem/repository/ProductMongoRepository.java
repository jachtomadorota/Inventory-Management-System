package com.dorota.inventorymanagementsystem.repository;

import com.dorota.inventorymanagementsystem.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductMongoRepository extends MongoRepository<Product,String>{

    Product findProductByEAN(String EAN);

}