package org.example.task2.hero;

public class Warrior extends Hero {

    private final String TYPE_HERO = getClass().getSimpleName();

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(TYPE_HERO + ": " + getName() + " атакует врага!");
    }
}
