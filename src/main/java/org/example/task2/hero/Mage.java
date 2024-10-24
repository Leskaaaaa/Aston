package org.example.task2.hero;

public class Mage extends Hero {

    private final String TYPE_HERO = getClass().getSimpleName();

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(TYPE_HERO + ": " + getName() + " атакует врага!");
    }
}
