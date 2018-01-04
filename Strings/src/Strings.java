
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
public class Strings {
    
    public static void main(String[] args)
    {
        
        for (int i = 0; i < args.length; i++)
        {
            System.out.println("Name " + i + ":  " + args[i]);
            System.out.println("Length:  " + args[i].length());
        }
        
        
//        Scanner in = new Scanner(System.in);
//        
//        String name1 = "";
//        String name2 = "";
//        
//        System.out.println("Enter the first name:  ");
//        if (in.hasNext())
//        {
//            name1 = in.next();
//        }
//        
//        System.out.println("Enter the second name:  ");
//        if (in.hasNext())
//        {
//            name2 = in.next();
//        }
//        
//        if (name1.equals(name2))
//        {
//            System.out.println(name1 + " is the same as " + name2);
//        }
//        else
//        {
//            System.out.println("not the same");
//        }
    }
    
}
