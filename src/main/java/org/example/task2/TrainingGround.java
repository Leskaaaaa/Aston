package org.example.task2;

import org.example.task2.enemy.Enemy;
import org.example.task2.hero.*;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Ivan", 20);
        Enemy enemy = new Enemy(100);

        warrior.attackEnemy(enemy);
    }
}
