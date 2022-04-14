package com.company;

public class TestCannonball {
    public static void main(String[] args) {
        Cannonball Cannon;
        Cannon = new Cannonball(0,0);
        // Localização Inicial
        System.out.println("Localizacao inicial: x=" + Cannon.getLocation().getX() + " | y=" + Cannon.getLocation().getY());
        // Lançar o Cannonball
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("ArrayList:   " + Cannon.shoot(70,10,0.5));


    }
}
