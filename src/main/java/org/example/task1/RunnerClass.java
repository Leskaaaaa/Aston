package org.example.task1;

import org.example.task1.model.Client;
import org.example.task1.model.Order;
import org.example.task1.model.Product;
import org.example.task1.service.AdministratorService;
import org.example.task1.service.ClientService;

import java.util.ArrayList;
import java.util.List;

public class RunnerClass {
    public static void main(String[] args) {
        AdministratorService administratorService = new AdministratorService();
        ClientService clientService = new ClientService();
        Client client = new Client("Ivan", 500);

        // Регистрация товара админом
        List<Product> products = new ArrayList<>();
        administratorService.addProduct(new Product("Phone", 100), products);

        // Создание заказа
        Order order = clientService.makeOrder(client);

        // Оплата заказа




        System.out.println("vf");
    }
}
