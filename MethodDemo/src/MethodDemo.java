/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class MethodDemo {
    public static void main(String [] args)
    {
        
        int avg = getAverage(6, 8);
        System.out.println("Average of 6 and 8 is " + avg);
        
        double dVal = getAverage(6.5, 8.5);
        System.out.println("Average of 6.5 and 8.5 is " + dVal);
        
        char mid = getAverage('A', 'Z');
        System.out.println("Average of A and Z is " + mid);
       
        
    }
    
    public static int getAverage(int a, int b)
    {
        int result = (a + b) / 2;
        return result;
    }
    
    public static double getAverage(double a, double b)
    {
        
        double result = (a + b) / 2;
        return result;
    }
    
    public static char getAverage(char a, char b)
    {
        int result = (a + b) / 2;
        return (char) result;
    }
    
}
