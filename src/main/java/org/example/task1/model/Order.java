package org.example.task1.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {

    private static Long countId = 0L;

    private Long id;

    private int priceOrder;

    private List<Product> products;

    private Client client;

    private boolean paid;

    public Order(Client client) {
        this.id = countId++;
        this.products = new ArrayList<>();
        this.client = client;
        this.paid = false;
    }

    public void addProduct(Product product) {
        products.add(product);
        priceCalculate();
    }

    private void priceCalculate() {
        priceOrder = 0;

        for (Product product : products) {
            priceOrder += product.getPrice();
        }
    }
}
