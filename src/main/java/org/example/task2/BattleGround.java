package org.example.task2;

import org.example.task2.enemy.Enemy;
import org.example.task2.enemy.Vampire;
import org.example.task2.enemy.Zombie;
import org.example.task2.hero.Archer;
import org.example.task2.hero.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleGround {
    public static void main(String[] args) {
        Random rand = new Random();
        Hero hero = new Archer("Ivan", 100, 21);
        Enemy zombie = new Zombie(100, 7);
        Enemy vampire = new Vampire(45, 50);

        ArrayList<Enemy> enemies = new ArrayList<>(List.of(zombie, vampire));

        enemies.forEach(enemy -> {
            while (enemy.isAlive() && hero.isAlive()) {
                hero.attackEnemy(enemy, rand.nextInt(3));

                if (enemy.isAlive()) {
                    enemy.attackEnemy(hero);
                }
            }
        });
    }
}
