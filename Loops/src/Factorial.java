/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author michaelmontgomery
 */
public class Factorial {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int num = input.nextInt();        
        int factorial = 1;
        
        for (int i = num; i > 1; i--)
        {
            factorial = factorial * i;
        }
        
        System.out.println(num + "!= " + factorial);

    }
    
    
}
