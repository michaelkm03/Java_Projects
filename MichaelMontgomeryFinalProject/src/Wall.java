/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Wall extends Entity {
     
    @Override
    public void create(){
       
    }
    
    public Wall(char symbol, int row, int column) {
        super(symbol, row, column);
        this.symbol = symbol;
        this.row = row;
        this.column = column;
    }
    
}
