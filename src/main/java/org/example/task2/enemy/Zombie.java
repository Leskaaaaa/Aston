package org.example.task2.enemy;

import org.example.task2.hero.Hero;

import java.util.Random;

public class Zombie extends Enemy {

    private final static String ENEMY_TYPE = Zombie.class.getSimpleName();

    private final static int HEALTH_AT_REINCARNATION = 40;

    private boolean isAlive;

    private final Random random = new Random();

    public Zombie(int health, int damage) {
        super(health, damage);
        isAlive = true;
    }

    @Override
    public void attackEnemy(Hero hero) {
        System.out.println(ENEMY_TYPE + " атакует вашего персонажа!");
        hero.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (!isAlive()) {
            System.out.println("Враг " + ENEMY_TYPE + ", мертв!");

            if (random.nextBoolean()) {
                reincarnation();
                System.out.println(ENEMY_TYPE + " воскрес!!!");
                health = HEALTH_AT_REINCARNATION;
                return;
            }

            return;
        }
        System.out.println("Текущее здоровье врага " + ENEMY_TYPE + ", ровняеется " + health);
    }

    @Override
    public boolean isAlive() {
        if (health <= 0) {
            isAlive = false;
        }
        return isAlive;
    }

    private void reincarnation() {
        isAlive = true;
    }
}
