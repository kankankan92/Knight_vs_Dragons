package com.company;

import com.company.elements.*;

import java.util.LinkedList;
import java.util.List;

public class Way {

    private List<Element> elements;

    Way(){
        elements = new LinkedList<>();
        Knight knight = new Knight();
        elements.add(knight);
        Road road = new Road();
        for (int i = 0; i<20; i++) {
            int random = (int)(Math.random()*100);
            if(random<20){
                Dragon dragon = new Dragon();
                elements.add(dragon);
            }else if(random<70) {
                elements.add(road);
            }else if(random<80){
                Wall wall = new Wall();
                elements.add(wall);
            }else {
                Chest chest = new Chest();
                elements.add(chest);
            }
        }
    }

    public List<Element> getElements() {
        return elements;
    }

    private void addElement(Element element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        String way = new String();
        for (Element element:elements) {
            way = way +element.toString();

        }
        return  way;
    }
}
