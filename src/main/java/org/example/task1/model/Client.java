package org.example.task1.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Client {

    private static Long countId = 0L;

    private Long id;

    private String name;

    private int balance;

    private List<Order> orders;

    private boolean isActive;

    public Client(String name, int balance) {
        this.id = countId++;
        this.name = name;
        this.orders = new ArrayList<>();
        this.balance = balance;
        this.isActive = true;
    }
}
