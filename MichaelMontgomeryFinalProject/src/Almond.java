/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Almond extends Nut{
    
    private final int nutritionPoints = 5;

    public Almond(char symbol, int row, int column) {
        super(symbol, row, column);
        this.symbol = symbol;
        this.row = row;
        this.column = column;
    }
    
    
    
}
