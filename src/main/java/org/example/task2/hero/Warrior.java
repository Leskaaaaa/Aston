package org.example.task2.hero;

import org.example.task2.enemy.Enemy;

public class Warrior extends Hero {

    private final String heroType = getClass().getSimpleName();

    public Warrior(String name, int damage) {
        super(name, damage);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(heroType + ": " + getName() + " атакует врага!");
        enemy.takeDamage(super.getDamage());
    }
}
