/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmontgomery
 */
public class Country implements Measurable {
    
    private String name;
    private int area;
    
    public Country(String name, int area){
        this.name = name;
        this.area = area;
    }
    
    @Override
    public int getMeasure(){
        return area;
    }
}
