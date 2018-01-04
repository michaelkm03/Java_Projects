
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
public class Squirrel extends Entity implements Movable{
    
    protected int pointsCollected;
    protected int totalNutsEaten;    

    public Squirrel(char symbol, int row, int column, int pointsCollected, int totalNutsEaten) {
        super(symbol, row, column);
        this.pointsCollected = pointsCollected;
        this.totalNutsEaten = totalNutsEaten;
        this.symbol = symbol;
        this.row = row;
        this.column = column;
        System.out.println("Squirrel has been created at position " + this.row + " , " + this.column + "\n");
    }

    @Override
    public void move(String direction){
        System.out.println("\n======================");
        System.out.println("[ SQUIRREL ]");
        System.out.println("Row:    " + this.row);
        System.out.println("Column:  "+ this.column);
        System.out.println("======================");
        if (direction.equals("u")){
            this.row-=1;
            Maze.maze[this.row][this.column] = this;
            Maze.maze[this.row + 1][this.column] = new Path(' ', this.row + 1, this.column);
        }
        else if (direction.equals("d")){
            this.row+=1;
            Maze.maze[this.row][this.column] = this;
            Maze.maze[this.row - 1][this.column] = new Path(' ', this.row - 1, this.column);
        }
        else if (direction.equals("l")){
            this.column-=1;
            Maze.maze[this.row][this.column] = this;
            Maze.maze[this.row][this.column + 1] = new Path(' ', this.row, this.column + 1);
            }
        else if (direction.equals("r")){
            this.column+=1;
            Maze.maze[this.row][this.column] = this;
            Maze.maze[this.row][this.column - 1] = new Path(' ', this.row, this.column - 1);
        }
        
    }
    
    public void eatNut(){
        if (Maze.maze[this.row][this.column].symbol == 'A' || Maze.maze[this.row][this.column].symbol == 'P'){
             System.out.println("found a nut");              
        }
        else {
            //System.out.println("empty");
        }
    }
    
    @Override
    public void create(){
        System.out.println("This is create method");
    } 
}
