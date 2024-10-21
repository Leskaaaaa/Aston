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
        List<Product> products = new ArrayList<>();

        Client client = new Client("Ivan", 500);
        Product phone = new Product("Phone", 100);
        Product banana = new Product("Banana", 50);

        // Регистрация товара админом
        products.add(administratorService.addProduct(phone));
        products.add(administratorService.addProduct(banana));

        // Пример блокировки (можно добавить в administratorService.registrationOrder(order) при условии если заказ не будет оплачен
        // administratorService.addClientInBlackList(client);

        // Создание заказа
        Order order = clientService.makeOrder(client, products);

        // Если клиент заблокирован
        if (order == null) {
            System.out.println("Клиент не может создать заказ");
            return;
        }

        // Оплата заказа
        clientService.payOrder(order);

        // Регистрация заказа
        administratorService.registrationOrder(order);

    }
}
