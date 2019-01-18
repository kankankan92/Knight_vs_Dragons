package com.company.elements;

import com.company.Way;

public class Knight implements Element{

    private int hp = 100;
    private  int attack = 10;

    public int getHp() {
        return hp;
    }

    public void increaseHp(int hp) {
        this.hp += hp;
    }

    public void reduceHp(int hp){
        this.hp -= hp;
    }

    public int getAttack() {
        return attack;
    }

    public void increaseAttack(int attack) {
        this.attack += attack;
    }

    @Override
    public String toString() {
        if(hp>0) {
            return "☺";
        }else{
            return "☠";
        }
    }

    @Override
    public void interaction(Knight knight, Way way) {

    }
}
