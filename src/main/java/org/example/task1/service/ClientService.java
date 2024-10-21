package org.example.task1.service;

import org.example.task1.model.Client;
import org.example.task1.model.Order;

public class ClientService {

    public Order makeOrder(Client client) {
        Order order = new Order(client);
        System.out.println("Заказ №" + order.getId() + " создан");
        return order;
    }

    public void payOrder(Order order) {

    }
}
