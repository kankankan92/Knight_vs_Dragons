package com.company.elements;

import com.company.Way;

public class Dragon implements Element{

    private int hp;
    private int attack=10;

    public Dragon(){
        this.hp = (int) (10+Math.random()*20);
    }

    public int getHp() {
        return hp;
    }

    public void reduceHp(int hp){
        this.hp -= hp;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public String toString() {
        if(hp>0){
            return "\uD83D\uDC09";
        }
        else{
            return "☠";
        }
    }

    @Override
    public void interaction(Knight knight, Way way){
        if (knight.getHp()>0 && hp>0){
            this.reduceHp(knight.getAttack());
            if(hp>0) {
                knight.reduceHp(attack);
            }
        }
    }
}
