package org.example.task2.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Hero {

    private final String name;

    private final int damage;

    public abstract void attackEnemy(Enemy enemy);

}
