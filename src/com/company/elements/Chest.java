package com.company.elements;

import com.company.Way;

public class Chest implements Element {

    private Element item;
    private boolean closed = true;

    public Chest() {
        int random = (int) (Math.random() * 10);
        if (random < 10) {
            item = new Health();
        } else {
            item = new Weapon();
        }
    }

    public Element getItem() {
        return item;
    }

    @Override
    public String toString() {
        if (closed) {
            return "✉";
        } else {
            return item.toString();
        }
    }


    @Override
    public void interaction(Knight knight, Way way) {
        way.getElements().add(2, ((Chest) way.getElements().get(1)).getItem());
    }
}
