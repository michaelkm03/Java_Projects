/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Main {
    public static void main (String[] args)
    {
        Point p1 = new Point();
        p1.setX(2);
        p1.setY(4);
        
        Point p2 = new Point();
        p2.setX(8);
        p2.setY(1);
        
        // Manual
        System.out.println("==== MANUAL ====");
        System.out.println("Upper Right Point:  " + p1.getX() + "," + p1.getY());
        System.out.println("Lower Left Point:   " + p2.getX() + "," + p2.getY());
        
        // Using Method Return
        System.out.println("\n==== METHOD RETURN ====");
        System.out.println("Upper Right Point:  " + p1.toString());
        System.out.println("Lower Left Point:   " + p2.toString());
    }
}
