package org.example.task1.service;

import org.example.task1.model.Client;
import org.example.task1.model.Order;
import org.example.task1.model.Product;

import java.util.List;

public class ClientService {

    public Order makeOrder(Client client, List<Product> products) {
        if (client.isActive()) {
            Order order = new Order(client);

            for (Product product : products) {
                order.addProduct(product);
            }

            order.priceCalculation();

            System.out.println("Заказ №" + order.getId() + " создан");
            return order;
        }

        return null;
    }

    public void payOrder(Order order) {
        Client client = order.getClient();
        int clientBalance = client.getBalance();
        int orderPrice = order.getPriceOrder();

        if (clientBalance >= orderPrice) {
            client.setBalance(clientBalance - orderPrice);
            order.setPaid(true);
            System.out.println("Заказ успешно оплачен");
        } else {
            System.out.println("Заказ не оплачен");
        }
    }
}
