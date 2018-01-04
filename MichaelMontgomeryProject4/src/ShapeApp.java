/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class ShapeApp {
    
    public static void main (String[] args)
    {
        
        // Decalre params
        Point upperLeft = new Point(1, 5);
        Point lowerLeft = new Point(1, 1);
        Point upperRight = new Point(5, 5);
        Point lowerRight = new Point(5, 1);  
        Point center = new Point(10,10);
        int radius = 4;
        
        // Create new rect obj, pass in params.  Then, call display on obj
        Rectangle r1 = new Rectangle(upperLeft, lowerLeft, upperRight, lowerRight);
        r1.displayRectangle(upperLeft, upperRight, lowerLeft, lowerRight);
        
        // Create new circle obj, pass in params.  Then, call display on obj
        Circle c1 = new Circle(center, radius);
        c1.displayCircle(center, radius);

        
    }
    
}