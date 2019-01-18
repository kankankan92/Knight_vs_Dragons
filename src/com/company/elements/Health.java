package com.company.elements;

import com.company.Way;

public class Health implements Element {

    @Override
    public void interaction(Knight knight, Way way) {
        knight.increaseHp(10);
    }

    @Override
    public String toString() {
        return "♡";
    }
}
