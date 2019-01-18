package com.company;

public class Main {

    public static void main(String[] args) {
        Game.run();
        try {
            Thread.sleep(1700);
        } catch(Exception e){
            System.out.println("Что-то пошло не так");
        }
        Game.start();
    }
}
