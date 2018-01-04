
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
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
public class Maze {
    
    // Max size of Maze
    final static int MAX_MAZE_ROW = 20;
    final static int MAX_MAZE_COL = 50;
    final static String FILENAME = "Maze.txt";
    static int count = 0;

    public static Entity[][] maze = new Entity[MAX_MAZE_ROW][MAX_MAZE_COL];
    
    public static void generateMaze(String FILENAME){
        // try block for opening, reading and assigning chars to maze 2d array
        try {
            Scanner s = new Scanner(new BufferedReader(new FileReader(FILENAME)));
            while (s.hasNextLine()){
                
                // 2d array for maze
                for (int row = 0; row < MAX_MAZE_ROW; row++){
                    String mazeLine = s.nextLine();
                    for (int column = 0; column < MAX_MAZE_COL; column++){
                        
                        // Assign each row,column index to charc.  If statement block to decide assignment in array
                        char c = mazeLine.charAt(column);
                        if (c == '*'){
                            maze[row][column] = new Wall('*', row, column);
                        }
                        
                        else if (c == ' '){
                            maze[row][column] = new Path(' ', row, column);
                        }
                        
                        else {
                            System.out.println("Do not recognize object...");
                        }
                        count++;
                    }
                }
            }
            System.out.println("Maze has successfully been created...It has " + count + " total cells");
        }
        catch (FileNotFoundException f) {
            f.printStackTrace();
        }
    }
    
    public static void display(){
        // Loop through maze object array, return current state
        for (int row = 0; row < MAX_MAZE_ROW; row++){
            for (int column = 0; column < MAX_MAZE_COL; column++){
                
                if (column < (MAX_MAZE_COL - 1)){
                    System.out.print(maze[row][column].symbol);
                }
                else if (column == (MAX_MAZE_COL - 1)){
                    System.out.println();
                }
            }
        }
    }
    
    public static boolean available(int row, int column){
       if (maze[row][column].symbol == ' '){
           return true; 
       }
          return false;
    }
    
}
    
