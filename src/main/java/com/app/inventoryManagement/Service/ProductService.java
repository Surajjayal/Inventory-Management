package com.app.inventoryManagement.Service;

import com.app.inventoryManagement.model.Product;
import com.app.inventoryManagement.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    /**
     * Retrieve all products
     * @return List of products
     */
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    /**
     * Add a new product to the repository
     * @param product The product to add
     */
    public void addProduct(Product product) {
        productRepo.save(product);
    }

    /**
     * Retrieve a product by its ID
     * @param id The ID of the product
     * @return Optional containing the product if found, or empty if not found
     */
    public Optional<Product> getProductById(String id) {
        return productRepo.findById(id);
    }

    /**
     * Delete a product by its ID
     * @param id The ID of the product to delete
     * @return true if the product was deleted, false if not found
     */
    public boolean deleteProductById(String id) {
        if (productRepo.existsById(id)) {
            productRepo.deleteById(id);
            return true;
        }
        return false;
    }
}

