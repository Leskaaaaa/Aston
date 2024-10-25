package org.example.task2.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.task2.Mortal;
import org.example.task2.enemy.Enemy;

@Getter
@AllArgsConstructor
public abstract class Hero implements Mortal {

    private final String name;

    protected int health;

    protected final int damage;

    public abstract void defaultAttackEnemy(Enemy enemy, int damage);

    public abstract void takeDamage(int damage);

}
