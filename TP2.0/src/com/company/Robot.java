package com.company;
import java.awt.Point;

public class Robot
{
    Point localizacao;
    String direcao;

    public Robot()
    {
        localizacao = new Point();
        direcao = "Norte";
    }

    public void turnLeft()
    {
        switch(direcao)
        {
            case "Norte":
            {
                direcao = "Oeste";
                break;
            }
            case "Oeste":
            {
                direcao = "Sull";
            }
        }


    }

    public void turnRight()
    {
        switch(direcao)
        {
            case "Sul":
            {
                direcao = "Leste";
                break;
            }
            case "Leste":
            {
                direcao = "Norte";
                break;
            }
        }
    }

    public void move()
    {
        switch(direcao)
        {
            case "Sul":
            {
                localizacao.x++;
                break;
            }
            case "Leste":
            {
                localizacao.y++;
                break;
            }

            case "Norte":
            {
                localizacao.x--;
                break;
            }
            case "Oeste":
            {
                localizacao.y--;
            }

        }
    }

    public Point getLocation()
    {
        return localizacao;
    }

    public String getDirection()
    {
        return direcao;
    }
}