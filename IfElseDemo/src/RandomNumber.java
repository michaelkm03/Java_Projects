/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class RandomNumber {
    public static void main(String[] args)
    {
        
        double rand = Math.random() * 50;
        
        /*if (rand >=40)
        {
            System.out.println(rand + " is bigger than 40");
        }
        else if (rand >= 30)
        {
            System.out.println(rand + " is between 30 and 40");
        }
        else if (rand >= 20)
        {
            System.out.println(rand + " is between 20 and 30");
        }
        else if (rand >=10)
        {
            System.out.println(rand + " is between 10 and 20");
        }
        else
        {
            System.out.println(rand + " is between 0 and 10");
        }
    }*/
    
        switch((int)rand/10)
        {
            case 4:
                System.out.println(rand + " is bigger than 40");
                break;
            case 3:
                System.out.println(rand + " is between 30 and 40");
                break;
            case 2:
                System.out.println(rand + " is between 20 and 30");
                break;
            case 1:
                System.out.println(rand + " is between 10 and 20");
                break;
            case 0:
                System.out.println(rand + " is between 0 and 10");
                break;
            default:
                System.out.println(rand + " outside range");
                break;
                
        }
    }
}
