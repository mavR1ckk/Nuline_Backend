package com.nuline.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Document(collection = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @MongoId
    private String productId;
    private String title;
    private Integer price;
    private String img;
    private List<String> descriptions;
    private boolean featured;
}
