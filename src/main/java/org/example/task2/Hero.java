package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Hero {

    private String name;

    public void attackEnemy() {
        System.out.println(name + " атакует врага!");
    }

}
