package org.example.task2.hero;

public class Mage extends Hero {

    private final String heroType = getClass().getSimpleName();

    public Mage(String name, int damage) {
        super(name, damage);
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(heroType + ": " + getName() + " атакует врага!");
        enemy.takeDamage(super.getDamage());
    }
}
