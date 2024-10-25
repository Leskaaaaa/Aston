package org.example.task2.enemy;

import lombok.Getter;
import org.example.task2.Mortal;
import org.example.task2.hero.Hero;

@Getter
public abstract class Enemy implements Mortal {

    protected int health;

    protected int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public abstract void attackEnemy(Hero hero);

    public abstract void takeDamage(int damage);

}
