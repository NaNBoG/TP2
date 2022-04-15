package com.company;

class Point
{
    double x1, y1;
    double x2, y2;

    Point(double i, double j,double k, double l)
    {
        x1 = i;
        y1 = j;
        x2 = k;
        y2 = l;

    }

    @Override
    public String toString(){
        return "( "+x1+" , "+y1+" ),( " +x2+" , " +y2+ " )";
    }
}