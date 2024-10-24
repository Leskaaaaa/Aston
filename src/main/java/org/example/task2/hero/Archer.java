package org.example.task2.hero;

public class Archer extends Hero {

    private final String TYPE_HERO = getClass().getSimpleName();

    public Archer(String name, int damage) {
        super(name, damage);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(TYPE_HERO + ": " + getName() + " атакует врага!");
        enemy.takeDamage(super.getDamage());
    }
}
