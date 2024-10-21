package org.example.task1.model;

import lombok.Data;

@Data
public class Product {

    private static Long countId = 0L;

    private Long id;

    private String name;

    private int price;

    public Product(String name, int price) {
        this.id = countId++;
        this.name = name;
        this.price = price;
    }
}
