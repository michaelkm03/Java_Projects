/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */

public class GradesProgram {
    public static void main(String[] args)
    {
        int count = 5;
        
        for (int i = 0; i < count; i++)
        {
            int grade = (int)(Math.random() * 50) + 50;
            
            if (grade >=90 && grade < 100)
            {
                System.out.println("Student grade is " + grade + " which is an A");
            }
            else if (grade >=80 && grade < 90)
            {
                System.out.println("Student grade is " + grade+ " which is a B");
            }
            else if (grade >=70 && grade <=80)
            {
                System.out.println("Student grade is " + grade + " which is a C");
            }
            else if (grade >=60 && grade <=70)
            {
                System.out.println("Student grade is " + grade + " which is a D");
            }
            else
            {
                System.out.println("Student grade is " + grade + " which is an F");
            }
        }
    }
    
}
