package com.company;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i =0;
        double x1=0;
        double x2=0;
        double y1=0;
        double y2=0;


        Scanner in = new Scanner(System.in);

        ArrayList<Double> lista = new ArrayList<Double>();
        System.out.println("Digite quatro numeros: ");
        while (i < 4) {
            lista.add(in.nextDouble());
            i++;
        }
        x1 = lista.get(0);
        y1 = lista.get(1);
        x2 = lista.get(2);
        y2 = lista.get(3);
        System.out.println(distanciaDePontos(x1,y1,x2,y2));
    }

    private static double distanciaDePontos(double x1, double y1, double x2,
                                            double y2){
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
}

