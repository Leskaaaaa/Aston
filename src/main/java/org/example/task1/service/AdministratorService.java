package org.example.task1.service;

import org.example.task1.model.Client;
import org.example.task1.model.Order;
import org.example.task1.model.Product;

public class AdministratorService {

    public Product addProduct(Product product) {
        System.out.println("Продукт " + product.getName() + " был добавлен в базу");
        return product;
    }

    public void addClientInBlackList(Client client) {
        client.setActive(false);
        System.out.println("Клиент " + client.getName() + "№" + client.getId() + " был заблокирован");
    }

    public void registrationOrder(Order order) {
        if (order.isPaid()) {
            System.out.println("Заказ зарегистрирован администратором");
        } else {
            System.out.println("Заказ не был оплачен");
        }
    }
}
