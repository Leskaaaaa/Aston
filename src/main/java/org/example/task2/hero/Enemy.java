package org.example.task2.hero;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("У врага " + health + " здоровья");
    }
}
