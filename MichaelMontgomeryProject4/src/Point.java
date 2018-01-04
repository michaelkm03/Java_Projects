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
    
    public Point (int newX, int newY)
    {
        this.x = newX;
        this.y = newY;

    }
    
    public void setX(int newX)
    {
        x = newX;
    }
    
    public void setY(int newY)
    {
        y = newY;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }

}
