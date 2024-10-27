package org.example.task2.hero;

import org.example.task2.enemy.Enemy;

public class Mage extends Hero {

    private final static String HERO_TYPE = Mage.class.getSimpleName();

    private boolean isAlive;

    public Mage(String name, int health, int damage) {
        super(name, health, damage);
        isAlive = true;
    }

    @Override
    public void attackEnemy(Enemy enemy, int randomDamage) {
        System.out.println(HERO_TYPE + ": " + getName() + " атакует врага!");
        enemy.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (isAlive()) {
            System.out.println("Текущее здоровье " + HERO_TYPE + " " + getName() + ", ровняеется " + health);
        } else {
            System.out.println("Ваш персонаж " + HERO_TYPE + " " + getName() + ", мертв!");
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
