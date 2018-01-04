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
    
    private Point upperLeft;
    private Point upperRight;
    private Point lowerLeft;
    private Point lowerRight;
    private int height;
    private int length;
    private int area;
    
    // Rectangle object, pass in 4 point params 
    public Rectangle(Point upperLeft, Point upperRight, Point lowerLeft, Point lowerRight)
    {
        this.upperLeft = upperLeft;
        this.upperRight =  upperRight;
        this.lowerLeft = lowerLeft;
        this.lowerRight = lowerRight;
    }
    
    // No return, call on obj to print info
    public void displayRectangle(Point upperLeft, Point upperRight, Point lowerLeft, Point lowerRight)
    {
        int height = (upperLeft.getY()) - (lowerLeft.getY());
        int width = (lowerRight.getX()) - (lowerLeft.getX());
        float area = height * width;



        System.out.println("Rectangle Info");
        System.out.println("==========================");
        System.out.println("Upper Left:     " + upperLeft);
        System.out.println("Upper Right:    " + upperRight);
        System.out.println("Lower Left:     " + lowerLeft);
        System.out.println("Lower Right:    " + lowerRight);   
        System.out.println("Area:           " + area);
        //System.out.println("HEIGHT:  "+ height);
        //System.out.println("WIDTH:  "+ width);
    }
    
//     
//    public Point upperLeft()
//    {
//        return upperLeft;
//    }
//    
//    public Point upperRight()
//    {
//        return upperRight;
//    }
//
//    public Point lowerLeft()
//    {
//        return upperLeft;
//    }
//    
//    public Point lowerRight()
//    {
//        return lowerRight;
//    }

    
}
