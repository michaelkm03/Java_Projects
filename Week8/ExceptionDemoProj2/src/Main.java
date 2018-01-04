
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args)
    {
        try
        {
            Scanner in = new Scanner(new File ("test.txt"));
            String data = in.next();
            int value = Integer.parseInt(data);
            System.out.println(value);
        }
        catch(Exception e)
        {
           System.out.println("Exception " + e.getMessage());
        }
        /*
        catch(FileNotFoundException e)
        {
            System.out.println("File not found " + e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println("file contains not integer data: " + e.getMessage());
        }
        */
    }
}
