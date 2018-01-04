/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Peanut extends Nut{
    
    private final int nutritionPoints = 10;

    public Peanut(char symbol, int row, int column) {
        super(symbol, row, column);
        this.symbol = 'P';
        this.row = row;
        this.column = column;
    }
    
}
