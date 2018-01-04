
import java.util.Scanner;

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
    
    public static void main(String[] args)
    {
        int [] values = new int [5];
        int currentsize = 0;
        
        System.out.println("Enter " + values.length + " integers");
        Scanner in = new Scanner(System.in);
        
        while (in.hasNext())
        {
            if (currentsize < values.length - 1)
            {
                values[currentsize] = in.nextInt();
                currentsize++;
            }
            if (currentsize == values.length)
            {
                break;
            }
        }
        
        for (int i = 0; i < values[i]; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println("");
    }
    
}
