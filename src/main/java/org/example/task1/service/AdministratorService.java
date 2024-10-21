package org.example.task1.service;

import org.example.task1.model.Client;
import org.example.task1.model.Product;

import java.util.List;

public class AdministratorService {

    public void addProduct(Product product, List<Product> products) {
        products.add(product);
        System.out.println("Продукт " + product.getName() + " был добавлен в базу");
    }

    public void addClientInBlackList(Client client) {
        client.setActive(false);
        System.out.println("Клиент " + client.getName() + "№" + client.getId() + " был заблокирован");
    }
}
