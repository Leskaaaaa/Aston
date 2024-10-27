package org.example.task2.enemy;

import org.example.task2.hero.Hero;

public class Vampire extends Enemy {

    private final static String ENEMY_TYPE = Vampire.class.getSimpleName();

    private final static double PERCENT_VAMPIRE = 0.2;

    private boolean isAlive;

    public Vampire(int health, int damage) {
        super(health, damage);
        isAlive = true;
    }

    @Override
    public void attackEnemy(Hero hero) {
        System.out.println(ENEMY_TYPE + " атакует вашего персонажа!");
        passiveVampiring(damage);
        hero.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (!isAlive()) {
            System.out.println("Враг " + ENEMY_TYPE + ", мертв!");
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

    private void passiveVampiring(int damage) {
        int vampiring = (int) (damage * PERCENT_VAMPIRE);
        health += vampiring;
    }
}
