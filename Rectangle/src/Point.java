/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Point {
    private int x;
    private int y;
    
    // public Point (int x, int y )
    
    public Point (Point p)
    {
        // x = p.x;
        // y = p.y;
        this(p.x,p.y);
    }

    public void setX(int newX)
    {
        if (newX > 0 && newX <= 10)
        {
            x = newX;
        }
        else
        {
            System.out.println("X is out of bound " + newX);
        }
    }
    public void setY(int newY)
    {
        if (newY > 0 && newY <= 10)
        {
            y = newY;
        }
        else
        {
            System.out.println("Y is out of bound " + newY);
        }
    }
    
    public int getX()
    {
        return x;
        
    }
    
    public int getY ()
    {
        return y;
    }
    
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}
