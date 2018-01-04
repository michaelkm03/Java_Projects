
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
abstract public class Entity {
    
    public char symbol;
    public int row;
    public int column; 

    public Entity(char symbol, int row, int column) {
        this.symbol = symbol;
        this.row = row;
        this.column = column;
    }
    
    public abstract void create();
    
    public Entity put(int newRow, int newCol){
        this.row = newRow;
        this.column = newCol;
        return this;
    }    
}