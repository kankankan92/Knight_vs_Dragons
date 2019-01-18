package com.company.elements;

import com.company.Way;

public class Road implements Element {

    @Override
    public String toString() {
        return "_";
    }

    @Override
    public void interaction(Knight knight, Way way) {
    }
}
