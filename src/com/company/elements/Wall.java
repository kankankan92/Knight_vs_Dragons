package com.company.elements;

import com.company.Way;

public class Wall implements Element {

    private int hp=2;

//    public Wall() {
//        this.hp = (int) (1 + Math.random() * 4);
//    }

    public int getHp() {
        return hp;
    }

    public void reduceHp() {
        this.hp -= 1;
    }

    @Override
    public void interaction(Knight knight, Way way) {
        reduceHp();
    }

    @Override
    public String toString() {
        String wall = "..";
        switch (hp) {
            case 1:
                wall = ".|";
                break;
            case 2:
                wall = "||";
                break;
            case 3:
                wall = ".|||";
                break;
            case 4:
                wall = "||||";
                break;
        }
        return wall;
    }
}
