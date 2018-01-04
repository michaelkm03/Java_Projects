/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Rectangle {
    private Point ur;
    private Point ll;
    private int height;
    private int length;
    private int area;
    
    public Rectangle(Point p_ur, Point p_ll)
    {
        ur = new Point(p_ur.getX(), p_ur.getY());
        ll = new Point(p_ll.getX(), p_ll.getY());
        
        height = ur.getY() - ll.getY();
        length = ll.getX() - ll.getY();
        
        area = height * length;  
        
    }

    public Point getUr() {
        return ur;
    }

    public Point getLl() {
        return ll;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return area;
    }
    
    public String toString()
    {
        return "Rectangle Area is " + area;
    }
    
}
