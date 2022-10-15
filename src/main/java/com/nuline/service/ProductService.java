package com.nuline.service;

import com.nuline.model.Product;
import com.nuline.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        productRepository.findAll();
        List<Product> all = productRepository.findAll();
        return productRepository.findAll();
    }

    public Product getProduct(String id){
        return productRepository.findById(id).get();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    @Transactional
    public List<Product> addAllProducts(List<Product> productList) {
        List<Product> products = productRepository.saveAll(productList);
        log.info("products saved");
        return products;
    }

    public List<Product> getFeatured() {
        return productRepository.findByFeatured(true);
    }
}
