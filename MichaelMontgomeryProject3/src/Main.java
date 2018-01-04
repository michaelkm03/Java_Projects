/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
Write a program that prompts the user to enter 5 integer numbers.  

Once the user enters the 5 numbers, the program must determine and output the average, the largest, and smallest number. (as functions)

Use the lecture slides and the examples in class as a guide to complete this assignment. Use the Scanner class shown in class to get user input from the terminal window.
You must define the methods listed below in your program.  

Make sure to keep the keyword "static" when you define the methods (we will learn later what static means). Call these methods from the "main" to get the job done.

  */

import java.util.Scanner;

public class Main {
    
    // Create function that takes in an integer array, returns average of all numbers
    static float getAverage(int[] num_array)
    {
        float avg = 0;
        float total = 0; 
        int i = 0;
        for (i = 0; i < num_array.length; i++)
        {
            total += num_array[i];
            
        }
        avg = (total / i );
        System.out.printf("\nThe Average is %.2f", avg);
        return avg;
    }
    
    // Create function that takes in integer array and returns the largest in array
    static int getLargest(int[] num_array){
        int LargestInt = num_array[0];
        for (int i = 0; i < num_array.length; i++){
            if (num_array[i] > LargestInt){
                LargestInt = num_array[i];
            }
            else{
                LargestInt = LargestInt;
            }
        }
        System.out.printf("\nThe Largest Integer is " + LargestInt);
        return LargestInt;
    }
    
    // Create a fucntion that takes in an integer array and returns the smallest integer in array
    static int getSmallest(int[] num_array){
        int SmallestInt = num_array[0];
        for (int i = 0; i < num_array.length; i++){
            if (num_array[i] <= SmallestInt){
                SmallestInt = num_array[i];
            }
            else{
                SmallestInt = SmallestInt;
            }
        }
        System.out.println("\nThe Smallest integer is " + SmallestInt);
        return SmallestInt;
    }
    
     public static void main(String[] args)
    {
        // Initialize integer array and take in 5 inputs from user
        int num_array[] = new int[5];
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("===== Enter 5 Intgers =====");
         while (i < 5)
        {
            System.out.print("Enter Number " + (i + 1) + ")  "); 
            int n = input.nextInt();
            // need integer validation
            num_array[i] = n;
            i+=1;
        }

        // Create new Main object, call methods on object
        Main object = new Main();
        System.out.println("\n=========================");
        object.getAverage(num_array);
        object.getLargest(num_array);
        object.getSmallest(num_array);
        System.out.print("\n=========================\n");
    }
}