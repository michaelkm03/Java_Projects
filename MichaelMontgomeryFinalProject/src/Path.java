/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Path extends Entity {
    
    @Override
    public void create(){
       
    }
    
    public Path(char symbol, int row, int column) {
        super(symbol, row, column);
        this.symbol = ' ';
        this.row = row;
        this.column = column;
    }
}
