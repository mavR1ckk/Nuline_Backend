package com.nuline.controller;

import com.nuline.model.Product;
import com.nuline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class NulineController {

    @Autowired
    private ProductService productService;

    @GetMapping("api/v1/getProducts")
    public List<Product> getAllProduct() {
        return productService.getAllProducts();
    }
    @GetMapping("api/v1/getProduct/{id}")
    public Product getProduct(@PathVariable String id) {
        return productService.getProduct(id);
    }

    @PostMapping("api/v1/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("api/v1/deleteProduct")
    public void deleteProduct(String id) {
        productService.deleteProduct(id);
    }

    @PostMapping("api/v1/addAllProducts")
    public List<Product> addProducts(@RequestBody List<Product> productList) {
        return productService.addAllProducts(productList);
    }

    @GetMapping("api/v1/featuredProduct")
    public List<Product> getFeatured(){
        return productService.getFeatured();
    }
}
