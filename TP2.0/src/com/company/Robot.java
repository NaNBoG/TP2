package com.company;
import java.awt.Point;

public class Robot
{
    Point location;
    String direction;

    // constructor
    public Robot()
    {
        location = new Point();
        direction = "N";
    }

    public void turnLeft()
    {
        switch(direction)
        {
            case "N":
            {
                direction = "W";
                break;
            }
            case "W":
            {
                direction = "S";
            }
        }


    }

    public void turnRight()
    {
        switch(direction)
        {
            case "S":
            {
                direction = "E";
                break;
            }
            case "E":
            {
                direction = "N";
                break;
            }
        }
    }

    public void move()
    {
        switch(direction)
        {
            case "S":
            {
                location.x++;
                break;
            }
            case "E":
            {
                location.y++;
                break;
            }

            case "N":
            {
                location.x--;
                break;
            }
            case "W":
            {
                location.y--;
            }

        }
    }

    public Point getLocation()
    {
        return location;
    }

    public String getDirection()
    {
        return direction;
    }
}