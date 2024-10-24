package org.example.task2.enemy;

import lombok.Getter;
import lombok.Setter;
import org.example.task2.Mortal;

@Getter
@Setter
public class Enemy implements Mortal {

    private int health;

    private boolean isAlive;

    public Enemy(int health) {
        this.health = health;
        isAlive = true;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (isAlive()) {
            System.out.println("У врага " + health + " здоровья");
        } else {
            System.out.println("Вражеский персонаж погиб");
        }
    }

    @Override
    public boolean isAlive() {
        if (health <= 0) {
            isAlive = false;
        }
        return isAlive;
    }
}
