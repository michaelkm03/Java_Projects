
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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
public class HungrySquirrelGame {
    
    public static void main(String [] args){
        int x = 0;
        int y = 0;
        Random randX = new Random();
        Random randY = new Random();
        Random nutChance = new Random();
        
        
        // Generate new maze from text file, and place Squirrel based on user input
        Maze m = new Maze();
        String FILENAME = "Maze.txt";
        m.generateMaze(FILENAME);
        int nutCount = 0;
        while (nutCount <= 5){
            //System.out.println(nutCount);
            int numX = randX.nextInt((Maze.MAX_MAZE_ROW - 1) + 1);
            int numY = randY.nextInt((Maze.MAX_MAZE_COL - 1) + 1);
            int nutType = nutChance.nextInt(100) + 1;

            if (Maze.available(numX, numY)){
                if (nutType < 51){
                    Almond a = new Almond('A', numX, numY);   
                    Maze.maze[numX][numY] = a;
                }
                else {
                    Peanut p = new Peanut('P', numX, numY);   
                    Maze.maze[numX][numY] = p;
                }
                nutCount++;
            }
        }

        System.out.println("\n==================== WELCOME TO MY MAZE GAME ====================\n");
        System.out.println("FORMAT:  Please enter [x,y] for Squirrel position");
        System.out.print("\n[ ENTER STARTING POSITION ]\n>  ");
        
        // Take User input for squirrel
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] lineVector = line.split(",");
               
        // Split user input into two vectors, x and y.  Validation with try/catch block.
        try {
            x = Integer.parseInt(lineVector[0].trim());
            y = Integer.parseInt(lineVector[1].trim());
            System.out.println(
                    "\n[ POSTION ]\n" 
                    + "Row:     " + x
                    + "\nColumn:  " + y
                    + "\n=================================================================\n");
            if (Maze.available(x , y))
            {
                Squirrel s = new Squirrel('@', x, y, 0, 0);   
                Maze.maze[x][y] = s;
                                
                // Start game.  Movement of Squirrel.
                while (s.totalNutsEaten < 5){
                    System.out.println("\n[ ENTER DIRECTION ]\n");
                    Scanner scan = new Scanner(System.in);
                    String direction = scan.next();
                    System.out.println(Maze.maze[x-1][y].symbol);
                    s.eatNut();
                    if (direction.equals("u") && Maze.maze[x-1][y].symbol !='*'){
                        s.move(direction);
                    }
                    else if (direction.equals("d") && Maze.maze[x+1][y].symbol !='*'){
                        s.move(direction);
                    }
                    else if (direction.equals("l") && Maze.maze[x][y-1].symbol !='*'){
                        s.move(direction);
                    }
                    else if (direction.equals("r") && Maze.maze[x][y+1].symbol !='*'){
                        s.move(direction);
                    }
                    else {
                        System.out.println("Cannot move.  There is a wall in the way.");
                    }
                                       
                    m.display();
                    
            }        }
            else 
            {
                System.out.println("Position not available for Squirrel...please try again.\n");
            }  
        }
        catch (Exception e){
            System.out.println ("Invalid input, please try again......");
        }  
        
        
    }
}    


        

