package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Cannonball {
    private double x;
    private double y;
    private double vX;
    private double vY;
    public final double g = 9.81;

    public Cannonball(double x, double y){
        this.x = x;
        this.y = y;
        vX = 0;
        vY = 0;
    }
        public void move(double deltaSec){
        x = x + vX * deltaSec;
        y = y + vY * deltaSec - 0.5 * g * deltaSec * deltaSec;
        vY = vY - g * deltaSec;

        }

        public Point getLocation(){
        return new Point((int) x, (int) y);
        }


        public ArrayList<Point> shoot (double alpha, double v,double deltaSec)
        {
            ArrayList locais = new ArrayList();

            vX = v * Math.cos(Math.toRadians(alpha));
            vY = v * Math.sin(Math.toRadians(alpha));

            while (getLocation().getY() >= 0)
            {
                System.out.println("Localizacao: x=" + getLocation().getX() + " | y=" + getLocation().getY());
                locais.add(getLocation());
                move(deltaSec);
            }
            // System.out.println("Cannonball caiu no chao");

            return locais;
        }

}
