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


public class Fibo {
    public static void main(String[] args)
    {      
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.print("Enter a number for Fibo: ");
        int num = reader.nextInt();
        // Create new Recursive fibo object &  Iterative fibo object
        Fibo fiboRecur = new Fibo();
        // Call both funcs on fibo object
        fiboRecur.FiboSumRecursively(num);
        // Assign returned value to int variable
        int recurReturn = fiboRecur.FiboSumRecursively(num);
        
        System.out.println("----------------\nFibonacci Total:  " + recurReturn);
        System.out.println("This was done recursively...\n");
        
    }
    public int FiboSumRecursively (int num)
    {
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
           return FiboSumRecursively (num -1) + FiboSumRecursively (num -2);
    }
}
