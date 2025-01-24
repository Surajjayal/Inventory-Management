package com.app.inventoryManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "productdetails")
public class Product {
    @Id
    private String id;
    private String productCategory;
    private String productName;
    private Long rating;
    private Long quality;
    private Long maximumProducts;
    private Long minimumProducts;
    private String userName;
    private String emailAddress;
    private Long phoneNumber;

}