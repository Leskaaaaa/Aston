package org.example.task2.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Hero {

    private final String name;
    private final int damage;

    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " атакует врага!");
        enemy.takeDamage(damage);
    }

}
