/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public abstract class Nut extends Entity {
    
    final int totalNuts = 5;
    private int nutritionPoints;
    private String name;

    public Nut(char symbol, int row, int column) {
        super(symbol, row, column);
    }
    
    @Override
    public void create(){
        System.out.println("This is create for Nut");
    }
    
}
