package com.example.eComApp.controller;

import com.example.eComApp.model.Product;
import com.example.eComApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/")
    public String greetings(){
       return "client & server Connected";
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId){

        return service.getProductById(proId);
    }
    @PostMapping("/products")
    public Product addProd(@RequestBody Product prod){
         return  service.addProduct(prod);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product prod){
        return  service.updateProduct(prod);

    }
    @DeleteMapping("/products/{proId}")
    public void deleteProduct(@PathVariable int proId){
        service.deleteProductById(proId);
    }

}

