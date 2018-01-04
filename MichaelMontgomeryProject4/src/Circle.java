/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Circle {
    private Point center;
    private int radius;
    private double area;
    final double Pi = 3.14;

    // Circle constructor, assign value to vars
    public Circle(Point center, int radius)
    {
        this.center = center;
        this.radius = radius;
        area = Pi * radius * radius;

    }
    
    // No return, print out Circle Info, call on circl obj
    public void displayCircle(Point center, int radius)
    {
        System.out.println("\nCirlce info");
        System.out.println("==========================");
        System.out.println("Center:         " + center);
        System.out.println("Radius:         " + radius);
        System.out.println("Area:           " + area);
    }
}
