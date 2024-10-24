package org.example.task2;

import org.example.task2.enemy.Enemy;
import org.example.task2.hero.Hero;
import org.example.task2.hero.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Ivan", 23);
        Enemy enemy = new Enemy(100);

        while (enemy.isAlive()) {
            warrior.attackEnemy(enemy);
        }

    }
}
