package com.example.eComApp.service;

import com.example.eComApp.model.Product;
import com.example.eComApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
@Component
public class ProductService {
    @Autowired
    ProductRepo repo;


    public List<Product> getProducts() {
        return repo.findAll();
    }
    public Product getProductById(int proId){
        /*
        *  without using Database
        return  products.stream()
                .filter(p -> p.getProdId() == proId)
                .findFirst().orElse(new Product (  100,
                "No Item",  0));
        */

        return repo.findById(proId).orElse(new Product());

    }
    public Product addProduct( Product prod){
        return  repo.save(prod);
    }

    public Product  updateProduct(Product prod) {
       /*
        for(int i=0;i<products.size();i++){
           if(products.get(i).getProdId()==prod.getProdId()){
               products.set(i,prod);
               return products;
           }

       }
        products.add(prod);

        */
        return  repo.save(prod);
    }

    public void deleteProductById(int proId) {
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()==proId){
//                return products.remove(i);
//            }
//        }
//        return new Product();

         repo.deleteById(proId);
    }
}