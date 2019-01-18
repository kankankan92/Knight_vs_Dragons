package com.company;

import com.company.elements.*;

public class Game {

    private static Way way;
    private static Knight knight;

    public static void run() {
        way = new Way();
        knight = ((Knight) way.getElements().get(0));
        for (int i = 0; i <10; i++){
            System.out.println();
        }
        Game.showGame();
    }

    public static void start() {
        int i = 0;
        while (i < way.getElements().size()-1) {
            Element currentElement = way.getElements().get(1);
            if (currentElement.getClass() == Health.class ||
                    currentElement.getClass() == Road.class ||
                    currentElement.getClass() == Chest.class) {
                currentElement.interaction(knight, way);
            } else if (currentElement.getClass() == Dragon.class) {
                while (knight.getHp() > 0 && ((Dragon) currentElement).getHp() > 0) {
                        System.out.println(currentElement.toString());
                        System.out.println("HP:" + ((Dragon) currentElement).getHp() + "  Атака:" + ((Dragon) currentElement).getAttack());
                    Game.showGame();
                    currentElement.interaction(knight, way);
                    try {
                        Thread.sleep(1800);
                    } catch(Exception e){
                        System.out.println("Что-то пошло не так");
                    }
                }
                if (((Dragon) currentElement).getHp() < 1) {
                    System.out.println(currentElement.toString());
                    System.out.println("HP:" + ((Dragon) currentElement).getHp() + "  Атака:" + ((Dragon) currentElement).getAttack());
                    Game.showGame();
                    try {
                        Thread.sleep(1800);
                    } catch(Exception e){
                        System.out.println("Что-то пошло не так");
                    }
                }
            }else if(currentElement.getClass() == Wall.class){
                while (((Wall)currentElement).getHp()>0){
                    currentElement.interaction(knight,way);
                    Game.showGame();
                    try {
                        Thread.sleep(1800);
                    } catch(Exception e){
                        System.out.println("Что-то пошло не так");
                    }
                }
            } else {
                break;
            }
            way.getElements().remove(1);
            Game.showGame();
            try {
                Thread.sleep(1800);
            } catch(Exception e){
                System.out.println("Что-то пошло не так");
            }
        }
    }

    private static void showGame() {
        System.out.println(knight.toString());
        System.out.println("HP:" + knight.getHp() + "  Атака:" + knight.getAttack());
        System.out.println();
        System.out.println(way);
        for (int i = 0; i <10; i++){
            System.out.println();
        }
    }
}
