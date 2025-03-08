package com.example.eComApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
    public Product(){

    }
}
