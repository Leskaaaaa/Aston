package org.example.task2.hero;

import org.example.task2.enemy.Enemy;

public class Archer extends Hero {

    private final String heroType = getClass().getSimpleName();

    public Archer(String name, int damage) {
        super(name, damage);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(heroType + ": " + getName() + " атакует врага!");
        enemy.takeDamage(super.getDamage());
    }
}
