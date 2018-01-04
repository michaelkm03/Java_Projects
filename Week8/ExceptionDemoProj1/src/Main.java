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
        System.out.println("starting main ...");
        boolean error = true;
        try 
        {
            foo(error);
        }
        catch(Exception e)
        {
            System.out.println("Main caught exception: " + e.getMessage());
        }
        try
        {
            boo(error);
        }
        catch(RuntimeException e)
        {
            System.out.println("Main caught exception: " + e.getMessage());
        }
        
        System.out.println("ending main ...");
    }
    
    /*
    // Option 1: foo catches the exception
    static void foo(boolean error)
    {
        System.out.println("starting foo ...");
        try
        {
            bar(error);
        }
        catch(Exception e)
        {
            System.out.println("foo caught exception:" + e.getMessage());
        }
        System.out.println("ending foo ...");
    }
    */
    
    static void foo(boolean error) throws Exception
    {
        System.out.println("starting foo ...");
        bar(error);
        System.out.println("ending foo ...");
    }
    
    static void bar(boolean error) throws Exception
    {
        System.out.println("starting bar ...");
        
        if (error)
        {
            Exception f = new Exception("some error occurred");
            throw f;
        }
        
        System.out.println("ending bar ...");
        
    }
    
    static void boo(boolean error) throws RuntimeException
    {
        System.out.println("starting bar ...");
        if (error)
        {
            throw new RuntimeException("bar exception");
        }
        System.out.println("ending bar ...");
    }
}
