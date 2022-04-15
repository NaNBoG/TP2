package com.company;


import java.awt.*;
import java.util.*;
import java.io.*;
import java.util.List;

public class Main
{
    static List<Point> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int i;
        Point ponto;
        System.out.print("Entre n : ");
        int n = in.nextInt();
        double x1 = 0,x2=0,y1=0,y2=0;
        System.out.print("Entre (x,y) : ");
        for (i = 0; i < n; i++) {
            x1 = in.nextInt();
            y1 = in.nextInt();
            x2 = in.nextInt();
            y2 = in.nextInt();
            ponto = new Point(x1,y1,x2,y2);
            list.add(ponto);
        }
        System.out.println(list);
        System.out.println("DISTANCIA DOS DOIS PRIMEIROS PONTOS "+ distanciaDePontos(x1,y1,x2,
                y2));

    }
    private static double distanciaDePontos(double x1, double y1, double x2,
                                            double y2){
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

    }


}